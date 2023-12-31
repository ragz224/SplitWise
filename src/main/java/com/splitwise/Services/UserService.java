package com.splitwise.Services;

import com.splitwise.Models.User;
import com.splitwise.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    private UserRepository userRepository;

@Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signup(String email, String password) {
    User user = new User();
    user.setEmail(email);
    user.setPassword(password);
   User saveduser =  userRepository.save(user);

   return saveduser;

    }
}
