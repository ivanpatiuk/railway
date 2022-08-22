package com.railway.service.impl;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import com.railway.exeptions.MyException;
import com.railway.repository.UserRepository;
import com.railway.service.UserService;
import com.railway.tools.IdCardTool;
import com.railway.tools.MapperTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return MapperTool.map(userRepository.findById(id).orElse(null), UserDTO.class);
    }

    @Override
    public UserDTO createUser(String name, String surname, String idCard) {
        throw new MyException("my exception");

//        User userToSave = User.builder()
//                .name(name)
//                .surname(surname)
//                .idCard(IdCardTool.validateIdCard(idCard))
//                .build();
//        if (userToSave.getIdCard() != null) {
//            System.out.println("Save returned");
//            return MapperTool.map(userRepository.save(userToSave), UserDTO.class);
//        } else {
//            System.out.println("Null returned");
//            return null;
//        }
    }
}
