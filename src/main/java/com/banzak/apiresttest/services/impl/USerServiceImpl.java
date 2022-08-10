package com.banzak.apiresttest.services.impl;

import com.banzak.apiresttest.model.User;
import com.banzak.apiresttest.repositories.UserRepository;
import com.banzak.apiresttest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class USerServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
         Optional<User> obj = repository.findById(id);
         return obj.orElse(null);
    }
}
