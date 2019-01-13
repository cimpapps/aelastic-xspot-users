package com.aelastic.xspot.users.config;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.List;


@Configuration
@PropertySource("classpath:kafka-dev.properties")
@ConfigurationProperties
@Getter
@Setter
@ToString
public class KafkaConfig {

    @Value("${broker.list}")
    private List<String> brokerList;


    @Value("${registration.topic}")
    private String registrationTopic;


    @Bean
    public KafkaProducer<String, String> kafkaProducer() {
        HashMap<String, Object> configs = new HashMap<>();
        //some kafka configuration
        configs.put(ProducerConfig.CLIENT_ID_CONFIG, registrationTopic);

        configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        return (KafkaProducer<String, String>) new KafkaProducer(configs);
    }


}
