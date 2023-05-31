package com.text.devellopement;

import com.text.devellopement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.text.devellopement.repository.StudentRepository;

import java.util.Date;
import java.util.List;


@SpringBootApplication

public class StudentApplication  implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}




	@Override
	public void run(String ...args) throws Exception{
      System.out.println("Run");
		this.studentRepository.save(
				new Student(null,"A1","ZOUHEIR",new Date(),true,null)
		);
		studentRepository.save(
				new Student(null,"A2","ALI",new Date(),true,null)
		);
		studentRepository.save(
				new Student(null,"A3","YOUSSEF",new Date(),true,null)
		);
		System.out.println("Finish");
		System.out.println("Count: "+studentRepository.count());
		System.out.println("Display Rows");
		List<Student> students = studentRepository.findAll();
		students.forEach(student -> {
			System.out.println(student.toString());
		});
		System.out.println("Get Elements By ID");
		Student student  = studentRepository.findById(3).orElse(null);
		System.out.println(student);
		System.out.println("Update an Element");
		student.setRegistrationNumber("S3");
		studentRepository.save(student);
		System.out.println("Delete an Element");
		studentRepository.delete(student);
		System.out.println("Count: "+studentRepository.count());
		studentRepository.deleteById(2);
		System.out.println("Count: "+studentRepository.count());
		System.out.println("Search by Id Query");
		Student student1 = studentRepository.SearchStudentById(1);
		System.out.println(student);
	}


}
