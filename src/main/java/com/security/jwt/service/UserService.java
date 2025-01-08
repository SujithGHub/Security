package com.security.jwt.service;

import org.springframework.stereotype.Service;

import com.security.jwt.model.Users;
import com.security.jwt.repository.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepo userRepo;

  public Users login(String userName, String password) throws Exception {
    Users loginUser = userRepo.loginCheck(userName);
    System.out.println(loginUser.getPassword());
    if (loginUser == null) {
      throw new NullPointerException();
    }
    if (!loginUser.getPassword().equals(password)) {
      throw new Exception();
    }else{
      System.out.println("ok");
    }

return loginUser;
  }

}
