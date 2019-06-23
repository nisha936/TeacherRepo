 package com.imaginology.Teacher;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.imaginology.Teacher.entity.Teacher;
import com.imaginology.Teacher.repository.TeacherRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
public class TeacherRepositoryTest {
	
	@Autowired  
	private TeacherRepository teacherRepository;


	//@Autowired
	//private TestEntityManager testEntityManager;
	
	
	@Test
	public void findByTeacherId_returnsTeacher() throws Exception{
			
		Teacher savedTeacher = teacherRepository.save(new Teacher((long) 001,"Nisha","Java","BIT"));
	
				Teacher teacher=  teacherRepository.findByTeacherId((long)001);
 
		Assertions.assertThat(teacher.getTeacherId()).isEqualTo(001);
		Assertions.assertThat(teacher.getName()).isEqualTo("Nisha");
		Assertions.assertThat(teacher.getSubject()).isEqualTo("Java");
		Assertions.assertThat(teacher.getCourse()).isEqualTo("BIT");
	}
	

}
