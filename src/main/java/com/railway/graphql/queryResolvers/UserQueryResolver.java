package com.railway.graphql.queryResolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.railway.dto.UserDTO;
import com.railway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    private final UserService userService;

    @Autowired
    public UserQueryResolver(UserService userService) {
        this.userService = userService;
    }

    public UserDTO getUserById(final Long id) {
        return userService.getUserById(id);
    }
}
