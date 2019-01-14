package com.aelastic.xspot.users.models.utils;

import com.aelastic.xspot.users.models.documents.UserDocument;
import com.aelastic.xspot.users.models.dto.UserDto;

public class UserMapper {

    public static UserDto toDto(UserDocument userDocument) {
        return UserDto.builder()
                //TODO implement
                .id(userDocument.getId())
                .email(userDocument.getEmail())
                .activated(userDocument.getActivated())
                .build();

    }

    public static UserDocument toDocument(UserDto userDto) {
        return UserDocument.builder()
                //TODO implement
                .id(userDto.getId())
                .email(userDto.getEmail())
                .activated(userDto.getActivated())
                .build();
    }


}
