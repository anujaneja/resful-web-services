package com.anujaneja.rest.webservices.restfulwebservices.dao;

import com.anujaneja.rest.webservices.restfulwebservices.model.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    public User save(User user);

    public User getUser(int id);

    public User deleteById(int id);

}
