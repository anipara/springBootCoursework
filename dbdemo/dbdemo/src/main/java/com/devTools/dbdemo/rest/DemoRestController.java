package com.devTools.dbdemo.rest;

import com.devTools.dbdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<Student>();
        students.add(new Student("Jojo","Smith","js@gmail.com"));
        students.add(new Student("Fifi","Thmas","fifi@gmail.com"));
        students.add(new Student("Lucky","Larray","larry@gmail.com"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return this.students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        if(studentId < 0 || studentId >= students.size()){
            throw new StudentNotFoundException("Given student id not found");
        }
        return this.students.get(studentId);
    }
}
