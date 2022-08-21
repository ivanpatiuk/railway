package com.railway.tools;

import com.railway.dto.UserDTO;
import com.railway.entity.User;
import org.modelmapper.ModelMapper;

import java.util.Objects;
import java.util.Optional;

public class Mapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static <T> T map(final Object object, final Class<T> clazz) {
        System.out.println();
        return object != null ? (T) modelMapper.map(object, clazz) : null;
    }
}
