package com.anujaneja.rest.webservices.restfulwebservices.service;

import com.anujaneja.rest.webservices.restfulwebservices.model.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User save(User user);

    public User findOne(int id);

    public User deleteById(int id);
}
