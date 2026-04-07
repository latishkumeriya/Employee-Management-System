package com.example.ems.controller;

import com.example.ems.entity.User;
import com.example.ems.repository.UserRepository;
import com.example.ems.security.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {

        User dbUser = userRepo.findByUsername(user.getUsername().trim());

        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {

            String token = jwtUtil.generateToken(dbUser.getUsername());

            Map<String, String> response = new HashMap<>();
            response.put("token", token);

            return response;
        }

        throw new RuntimeException("Invalid username or password");
    }
}