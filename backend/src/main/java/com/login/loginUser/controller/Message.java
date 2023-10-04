package com.login.loginUser.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("First", "Second"));
    }
}
