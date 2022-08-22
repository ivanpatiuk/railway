package com.railway.graphql.mutationResolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.railway.dto.UserDTO;
//import com.railway.exeptions.VehicleAlreadyPresentException;
import com.railway.exeptions.MyException;
import com.railway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    private final UserService userService;

    @Autowired
    public UserMutationResolver(UserService userService) {
        this.userService = userService;
    }

    public UserDTO createUser(String name, String surname, String idCard){
        throw new MyException("Hello");
//        return userService.createUser(name, surname, idCard);
    }
}
