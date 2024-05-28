package com.example.demomvc.API;

import com.example.demomvc.Entity.User;
import com.example.demomvc.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api-user")
public class UserAPI {

    @Autowired
    private UserRepository UserRepository;

    @GetMapping("/getInformation")
    public ResponseEntity<?> doGetInformation() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World");
        result.put("status", true);
        result.put("data", UserRepository.findAll());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/postInformation")
    public ResponseEntity<?> doPostInformation(@RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World");
        result.put("status", true);
        result.put("data", UserRepository.saveAndFlush(user));
        return ResponseEntity.ok(result);
    }
}
