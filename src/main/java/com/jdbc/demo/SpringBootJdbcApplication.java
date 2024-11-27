package com.jdbc.demo;

import com.jdbc.demo.model.Student;
import com.jdbc.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootJdbcApplication.class, args);

		Student student = applicationContext.getBean(Student.class);

		student.setRollNo(104);
		student.setName("Bruce");
		student.setMarks(78);

		StudentService studentService = applicationContext.getBean(StudentService.class);
		studentService.add(student);

		List<Student> studentsList = studentService.getAllStudents();

		studentsList.forEach(System.out::println);

	}

}
