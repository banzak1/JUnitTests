package com.banzak.apiresttest.services;

import com.banzak.apiresttest.model.User;

public interface UserService {

    User findById(Integer id);
}
