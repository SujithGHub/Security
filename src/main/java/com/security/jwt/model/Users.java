package com.security.jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Users {
  @Id
  @GeneratedValue
  private String userId;
  private String userName;
  private String password;
}
