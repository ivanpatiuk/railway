package com.railway.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScalarGraphqlConfig {
    @Bean
    public GraphQLScalarType Long(){
        return ExtendedScalars.GraphQLLong;
    }

    @Bean
    public GraphQLScalarType BigDecimal(){
        return ExtendedScalars.GraphQLBigDecimal;
    }

    @Bean
    public GraphQLScalarType Date(){
        return ExtendedScalars.Date;
    }

    @Bean
    public GraphQLScalarType DateTime(){
        return ExtendedScalars.DateTime;
    }

}
