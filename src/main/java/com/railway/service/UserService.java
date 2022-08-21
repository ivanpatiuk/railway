package com.railway.service;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDTO getUserById(Long id);

    UserDTO createUser(String name, String surname, String idCard);
}
