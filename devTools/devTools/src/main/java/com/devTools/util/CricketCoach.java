package com.devTools.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("Cricket coach constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Cricket jumps";
    }
}
