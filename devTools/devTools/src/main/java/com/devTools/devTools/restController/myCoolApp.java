package com.devTools.devTools.restController;

import com.devTools.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myCoolApp {

    private Coach myCoach;
//    Constructor injection for dependency injection;
//    Created by creating object of myCoolApp type
    @Autowired
    public myCoolApp(@Qualifier("basketballCoach") Coach theCoach){
        myCoach = theCoach;
    }

    //    Setter injection for dependency injection;
    //    Created by setting object of myCoach type
    @Autowired
//    add @Qualifier("basketballCoach") to method argument
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/")
    public String getHello(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "We are running";
    }

    // Inserts custom property from application.properties file
    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/name")
    public String getName(){
        return coachName;
    }

}
