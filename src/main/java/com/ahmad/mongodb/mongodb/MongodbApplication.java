package com.ahmad.mongodb.mongodb;

import com.ahmad.mongodb.mongodb.domain.Address;
import com.ahmad.mongodb.mongodb.domain.Student;
import com.ahmad.mongodb.mongodb.enumiration.Gender;
import com.ahmad.mongodb.mongodb.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){

		return args -> {

			Address address = new Address("iran", "tehran", "123456");
			Student student = new Student(
					"Ahmad"
					, "Yazdi"
					,"ahmadyazdi243@gmailcom"
					, Gender.MALE
					, address
					, List.of("computer sience", "development")
					, BigDecimal.TEN
					, LocalDateTime.now()
			);

			//findByEmailUsingMongoTemplateAndQuery(mongoTemplate);

			repository.findStudentByEmail("ahmadyazdi243@gmailcom").ifPresentOrElse(
					s -> {
						System.out.println("student already exists!!!");
					},
					() -> {
						System.out.println("saving student");
						repository.insert(student);
					}
			);

		};

	}
	 */

	private static void findByEmailUsingMongoTemplateAndQuery(MongoTemplate mongoTemplate) {
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is("ahmadyazdi243@gmailcom"));
		List<Student> students = mongoTemplate.find(query, Student.class);

		if (students.size() > 0){
			throw new IllegalStateException("found another student with this email");
		}
	}

}
