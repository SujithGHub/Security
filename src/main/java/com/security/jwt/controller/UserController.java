package com.security.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.model.Users;
import com.security.jwt.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody Users user) {
    try {
      Users loginUser = userService.login(user.getUserName(), user.getPassword());
      return  ResponseEntity.status(HttpStatus.OK).body(loginUser);
    } catch (Exception e) {

      return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
  }
}
