package com.aelastic.xspot.users.services;

import com.aelastic.xspot.users.models.documents.UserDocument;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {


    @Value("${register-user-topic}")
    private String registerUserTopic;


    private KafkaTemplate<String, UserDocument> kafkaTemplate;


    @Autowired
    public KafkaProducerService(KafkaTemplate<String, UserDocument> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Async
    public void registerUser(UserDocument userDocument) {
        ProducerRecord record = new ProducerRecord<String, UserDocument>(registerUserTopic, userDocument.getId(), userDocument);
        
        kafkaTemplate.send(record);
    }
}
