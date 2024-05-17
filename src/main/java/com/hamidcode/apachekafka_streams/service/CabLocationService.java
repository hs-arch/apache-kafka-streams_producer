package com.hamidcode.apachekafka_streams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public CabLocationService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    public CabLocationService(KafkaTemplate<String, Object> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }

    public boolean updateLocation(String location){
        kafkaTemplate.send("cab-location", location);
        return true;
    }

//    public boolean consumeLocation(){
//        kafkaTemplate.re
//    }
}
