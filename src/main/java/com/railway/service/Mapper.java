package com.railway.service;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import org.modelmapper.ModelMapper;

public class Mapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static <T> T map(final Object object, final Class<T> clazz) {
        return (T) modelMapper.map(object, clazz);
    }
}
