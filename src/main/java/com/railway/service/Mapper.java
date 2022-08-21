package com.railway.service;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import org.modelmapper.ModelMapper;

public class Mapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static Object toDto(final Object object, final Class clazz) {
        return modelMapper.map(object, clazz);
    }

    public static Object toEntity(final Object object, final Class clazz){
        return modelMapper.map(object, clazz);
    }
}
