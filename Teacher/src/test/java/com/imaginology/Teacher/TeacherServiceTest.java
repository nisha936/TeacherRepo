package com.imaginology.Teacher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.imaginology.Teacher.entity.Teacher;
import com.imaginology.Teacher.entity.TeacherNotFoundException;
import com.imaginology.Teacher.repository.TeacherRepository;
import com.imaginology.Teacher.service.TeacherService;
import com.imaginology.Teacher.teacherDto.TeacherDto;

@RunWith(MockitoJUnitRunner.class)
public class TeacherServiceTest {
	
	@Mock
	 private TeacherRepository teacherRepository;
	 
	
	@MockBean
	private TeacherService teacherService;
	
	@Before
	public void setUp() throws Exception{
		teacherService = new TeacherService(teacherRepository);
	}
	
	/*
	 * @Test public void createTeacherDetails() { Teacher teacher = new Teacher();
	 * teacher.setTeacherId(002L); teacher.setName("Sushma");
	 * teacher.setSubject("Android"); teacher.setCourse("BIT");
	 * 
	 * BDDMockito.given( teacherRepository.save(teacher)).willReturn(teacher);
	 * Assertions.assertThat(teacherService.createTeacherDetails(teacher)).isEqualTo
	 * (teacher); }
	 */
	@Test
	public void createTeacherDetails() {
		
		TeacherDto teacherDto = new TeacherDto();
		teacherDto.setId(001L);
		teacherDto.setTeacherId(002L);
		teacherDto.setName("Nisha");
		teacherDto.setCourse("IT");
		teacherDto.setSubject("java");

		Teacher teacher = getTeacher();
		
		Mockito.when(teacherService.createTeacherDetails(teacherDto)).thenReturn(teacher);
		

		Teacher savedTeacher = teacherService.createTeacherDetails(teacherDto);

		assertNotNull(savedTeacher);
		assertEquals(teacher.getTeacherId(), savedTeacher.getTeacherId());
		assertEquals(teacher.getName(), savedTeacher.getName());

	}
	
	private Teacher getTeacher() {
		Teacher teacher = new Teacher();
		teacher.setId(001L);
		teacher.setTeacherId(002L);
		teacher.setName("Nisha");
		teacher.setCourse("IT");
		teacher.setSubject("java");
		return teacher;
	}


	
	
	@Test
	public void getTeacherDetails_returnsTeacherInfo() {
		BDDMockito.given(teacherRepository.findByTeacherId(001L))
		.willReturn(new Teacher((long) 001, "Nisha", "Java", "BIT"));
	
		Teacher teacher = teacherService.getTeacherDetails(001);
		
		Assertions.assertThat(teacher.getTeacherId()).isEqualTo(001);
		Assertions.assertThat(teacher.getName()).isEqualTo("Nisha");
		Assertions.assertThat(teacher.getSubject()).isEqualTo("Java");
		Assertions.assertThat(teacher.getCourse()).isEqualTo("BIT");
		
	}
	
//	@Test
//	public void getAllTeachers_returnsAllTeachers() {
//		BDDMockito.given(teacherRepository.findAll()).willReturn( new (List<Teacher>) teacherRepository.findAll());
//		
//		List<Teacher> teacher = teacherService.getAllTeachers();
//		
//		Assertions.assertThat(teacher.getTeacherId()).isEqualTo(001);
//		Assertions.assertThat(teacher.getName()).isEqualTo("Nisha");
//		Assertions.assertThat(teacher.getSubject()).isEqualTo("Java");
//		Assertions.assertThat(teacher.getCourse()).isEqualTo("BIT");
//		
//	}
	
	@Test(expected = TeacherNotFoundException.class)
	public void getTeacherDetails_whenTeacherNotFound() throws Exception{
		BDDMockito.given(teacherRepository.findByTeacherId(001L))
		.willReturn(null);
		
		teacherService.getTeacherDetails(1);
	}
	
	/*
	 * @Test public void deleteTeacherDetails() throws Exception{
	 * BDDMockito.given(teacherRepository.delete(getTeacher()); }
	 */
	
	
	
 }
