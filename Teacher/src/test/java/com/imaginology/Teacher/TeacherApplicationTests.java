package com.imaginology.Teacher;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.imaginology.Teacher.entity.Teacher;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TeacherApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void TeacherDetails() throws Exception{
		
		//act 
		ResponseEntity<Teacher> response = restTemplate
				.getForEntity("/teachers/Nisha", Teacher.class);
		
		//assert
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(response.getBody().getName()).isEqualTo("Nisha");
		Assertions.assertThat(response.getBody().getSubject()).isEqualTo("Java");
		Assertions.assertThat(response.getBody().getCourse()).isEqualTo("BIT");
		Assertions.assertThat(response.getBody().getTeacherId()).isEqualTo(001);


		}

}
