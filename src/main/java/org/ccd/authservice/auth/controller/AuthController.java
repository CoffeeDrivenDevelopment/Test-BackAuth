package org.ccd.authservice.auth.controller;

import lombok.RequiredArgsConstructor;
import org.ccd.authservice.auth.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth-serivce/v1")
@RequiredArgsConstructor
@RestController
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(){

        return ResponseEntity.ok("LOGIN SUCCESS");
    }
}
