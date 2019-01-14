package com.aelastic.xspot.users.services;

import com.aelastic.xspot.users.models.documents.UserDocument;
import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.models.utils.UserMapper;
import com.aelastic.xspot.users.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepo userRepo;

    private KafkaProducerService kafkaProducerService;

    @Autowired
    public UserService(UserRepo userRepo, KafkaProducerService kafkaProducerService) {
        this.userRepo = userRepo;
        this.kafkaProducerService = kafkaProducerService;
    }

    public List<UserDto> findAll() {
        return userRepo.findAll().stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }

    public UserDto addUser(UserDto userDto) {
        UserDocument userDocument = userRepo.save(UserMapper.toDocument(userDto));

        kafkaProducerService.registerUser(userDocument);

        return UserMapper.toDto(userDocument);
    }

    public UserDto activateUser(String id) {
        Optional<UserDocument> userDoc = userRepo.findById(id);
        return userDoc.map(u -> {
            u.setActivated(true);
            return UserMapper.toDto(userRepo.save(u));
        }).get();
    }
}
