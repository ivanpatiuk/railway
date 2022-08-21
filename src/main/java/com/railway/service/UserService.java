package com.railway.service;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDTO getUserById(final Long id);
}
