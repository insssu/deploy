package com.study.deploy_back.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${client.address}")
    private String clientAddress;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(clientAddress + "테스트 !");
    }
}
