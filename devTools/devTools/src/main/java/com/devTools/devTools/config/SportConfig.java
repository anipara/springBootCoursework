package com.devTools.devTools.config;

import com.devTools.util.Coach;
import com.devTools.util.CricketCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach cricketCoach(){
        return new CricketCoach();
    }

}
