package com.devTools.dbdemo.dao;

import com.devTools.dbdemo.entity.Student;
import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> byLastName(String lname);

    void update(Student theStudent);

    void delete(Integer id);
}
