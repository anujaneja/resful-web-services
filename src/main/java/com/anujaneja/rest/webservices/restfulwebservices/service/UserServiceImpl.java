package com.anujaneja.rest.webservices.restfulwebservices.service;

import com.anujaneja.rest.webservices.restfulwebservices.dao.UserDao;
import com.anujaneja.rest.webservices.restfulwebservices.dao.UserDaoImpl;
import com.anujaneja.rest.webservices.restfulwebservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    @Override public List<User> findAll() {
        return userDao.findAll();
    }

    @Override public User save(User user) {
            return userDao.save(user);
    }

    @Override public User findOne(int id) {
        return userDao.getUser(id);
    }

    @Override public User deleteById(int id) {
        return userDao.deleteById(id);
    }
}
