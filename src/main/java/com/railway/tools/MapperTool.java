package com.railway.tools;

import org.modelmapper.ModelMapper;

public class MapperTool {

    private static ModelMapper modelMapper = new ModelMapper();

    public static <T> T map(final Object object, final Class<T> clazz) {
        System.out.println();
        return object != null ? (T) modelMapper.map(object, clazz) : null;
    }
}
