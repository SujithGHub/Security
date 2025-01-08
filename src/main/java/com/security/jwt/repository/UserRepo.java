package com.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.jwt.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, String> {
  @Query("select u from Users u where u.userName=:userName")
  public Users loginCheck(String userName);

}
