package com.anujaneja.rest.webservices.restfulwebservices.dao;

import com.anujaneja.rest.webservices.restfulwebservices.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    private static List<User> users     = new ArrayList<>();
    private static int        userCount = 0;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
        userCount = 3;
    }

    @Override public List<User> findAll() {
        return users;
    }

    @Override public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);

        return user;
    }

    @Override public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    @Override
    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()) {
            User user = iterator.next();
            if(user.getId()==id) {
                iterator.remove();

                return user;
            }
        }

        return null;
    }
}
