package com.devTools.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Can set @Lazy for specific beans
//@Lazy

// Can set scope
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach{

    public BasketballCoach(){
        System.out.println("Basketball coach constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot some threes";
    }

    @PostConstruct
    public void afterBeanConstruction(){
        System.out.println("After bean construction" + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestoryBean(){
        System.out.println("Before destroying bean");
    }



}
