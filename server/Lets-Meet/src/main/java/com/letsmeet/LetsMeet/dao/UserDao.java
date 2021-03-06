package com.letsmeet.LetsMeet.dao;

import com.letsmeet.LetsMeet.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {
//    find user via user's username;
    User findByUsername(String username);

}
