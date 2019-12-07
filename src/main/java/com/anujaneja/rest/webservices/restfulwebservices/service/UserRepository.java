package com.anujaneja.rest.webservices.restfulwebservices.service;

import com.anujaneja.rest.webservices.restfulwebservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
