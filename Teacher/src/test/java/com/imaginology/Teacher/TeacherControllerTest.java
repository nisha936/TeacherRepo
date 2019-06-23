package com.imaginology.Teacher;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imaginology.Teacher.entity.Teacher;
import com.imaginology.Teacher.entity.TeacherNotFoundException;
import com.imaginology.Teacher.service.TeacherService;



@RunWith(SpringRunner.class)
@WebMvcTest
public class TeacherControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private TeacherService teacherService;
	
	//integration testing
	
	@Test
	public void createTeacher_returnsTeacher() throws Exception{
		Teacher teacher = new Teacher();
		teacher.setTeacherId(002L);
		teacher.setName("Sushma");
		teacher.setSubject("Android");
		teacher.setCourse("BIT");
		
		ObjectMapper objectMapper= new ObjectMapper();
		String requestJson = objectMapper.writeValueAsString(teacher);
		mockMvc.perform(MockMvcRequestBuilders.post("/teachers/teachers")
		.contentType(MediaType.APPLICATION_JSON)
		.content(requestJson))
		.andExpect(MockMvcResultMatchers.status().isCreated());
	}
		
	@Test
	public void getAllTeachers_returnsAllTeachers() throws Exception {
		Teacher teacher = new Teacher();
		teacher.setTeacherId(002L);
		teacher.setName("Sushma");
		teacher.setSubject("Android");
		teacher.setCourse("BIT");
		
		ObjectMapper objectMapper= new ObjectMapper();
		String requestJson = objectMapper.writeValueAsString(teacher);
		mockMvc.perform(MockMvcRequestBuilders.get("/teachers")
		.contentType(MediaType.APPLICATION_JSON)
		.content(requestJson))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	
	
		
	@Test
	public void getTeacher_returnsTeacher() throws Exception {
		BDDMockito.given(teacherService.getTeacherDetails(ArgumentMatchers.anyLong()))
		.willReturn(new Teacher((long) 001,"Nisha","Java","BIT"));
		
		
		mockMvc.perform(MockMvcRequestBuilders.get("/teachers/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("teacherId").value(001))
		.andExpect(jsonPath("name").value("Nisha"))
		.andExpect(jsonPath("subject").value("Java"))
		.andExpect(jsonPath("course").value("BIT"));
		
	}
	
	@Test
	public void getTeacher_notFound() throws Exception{
		BDDMockito.given(teacherService.getTeacherDetails(ArgumentMatchers.anyLong()))
			.willThrow( new TeacherNotFoundException());
	
		mockMvc.perform(MockMvcRequestBuilders.get("/teachers/1"))
		.andExpect(status().isNotFound());
	} 
	
	 @Test 
	 public void test_deleteSchoolBySchoolId() throws Exception{
		 ResultActions result =
		 mockMvc.perform(MockMvcRequestBuilders.delete("/schools/1")
		  .accept(MediaType.APPLICATION_JSON))
		  .andExpect(MockMvcResultMatchers.status().isNotFound());
		 
		 
		  }
		 
}