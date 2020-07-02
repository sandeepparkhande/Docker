package com.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
@Data
public class User {
    @Id
    String id;
    @Column(name = "NAME")
    String name;
    @Column(name = "PASSWORD")
    String password;
}
