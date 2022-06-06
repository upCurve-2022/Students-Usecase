package com.example.demo1;

import com.example.demo1.Entity.Student;
import com.example.demo1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	//Student student1=new Student("Prateek","Kandoju","BRECW","kprateek@gmail.com");
	//studentRepository.save(student1);
//
//
//		Student student2=new Student("Prem","Kagithala","kprem@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3=new Student("Viveak","Guntoju","gviveak@gmail.com");
//		studentRepository.save(student3);
	}
}