package com.hamidcode.apachekafka_streams.controller;

import com.hamidcode.apachekafka_streams.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

//    Write and call your methods, Business Logics

    @Autowired
    CabLocationService cabLocationService;

//    This is the response entity and this will return our data as a JSON object thats all.

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range=100;
        while(range>0){
            System.out.println(Math.random()+","+Math.random());
            cabLocationService.updateLocation(Math.random()+","+Math.random());
            Thread.sleep(2000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated"),HttpStatus.OK);
    }
}
