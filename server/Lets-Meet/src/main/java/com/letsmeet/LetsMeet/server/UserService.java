package com.letsmeet.LetsMeet.server;

import com.letsmeet.LetsMeet.bean.User;
import com.letsmeet.LetsMeet.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public boolean registerUser(User user) {
        try {
            userDao.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
