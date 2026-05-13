package com.raj.expensetracker.service.impl;

import com.raj.expensetracker.entity.User;
import com.raj.expensetracker.repository.UserRepository;
import com.raj.expensetracker.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}