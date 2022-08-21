package com.railway.graphql.queryResolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.railway.entity.User;
import com.railway.enums.Exemption;
import org.springframework.stereotype.Component;

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    public User getUser(){
        return User.builder()
                .id(1L)
                .name("Ivan")
                .surname("Patiuk")
                .exemption(Exemption.Student)
                .build();
    }
}
