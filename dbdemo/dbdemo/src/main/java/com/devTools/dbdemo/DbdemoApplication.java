package com.devTools.dbdemo;

import com.devTools.dbdemo.dao.StudentDAO;
import com.devTools.dbdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			readStudent(studentDAO, 1);
//			createStudent(studentDAO);
//			getAllStudents(studentDAO);
//			findStudentByLastName(studentDAO, "Bonjor");
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			getAllStudents(studentDAO);

		};
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Bobby","Junior","bobbysunhouse@gmail.com");
		studentDAO.save(student);
		System.out.println("Student has been created: " + student.getId());
	}

	private void readStudent(StudentDAO studentDAO, Integer id){
		Student student = studentDAO.findById(id);
		System.out.println(student.toString());
	}

	private void getAllStudents(StudentDAO studentDAO){
		List<Student> students = studentDAO.findAll();
		students.forEach((student -> System.out.println(student.toString())));
	}

	private void findStudentByLastName(StudentDAO studentDAO, String lastname) {
		List<Student> student = studentDAO.byLastName(lastname);
		student.forEach(student1 -> System.out.println(student1));
	}

	private void updateStudent(StudentDAO studentDAO){
		Student student = studentDAO.findById(1);
		student.setEmail("updatedemail@gmail.com");
		studentDAO.update(student);
	}

	private void deleteStudent(StudentDAO studentDAO){
		studentDAO.delete(1);
		System.out.println("Student has been deleted ");
	}
}
