package com.railway.service.impl;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import com.railway.enums.Exemption;
import com.railway.repository.UserRepository;
import com.railway.service.UserService;
import com.railway.tools.Mapper;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserById(final Long id) {
        return Mapper.map(userRepository.findById(id).orElse(null), UserDTO.class);
    }
}
