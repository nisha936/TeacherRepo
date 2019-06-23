package com.imaginology.Teacher.repository;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.imaginology.Teacher.entity.Teacher;

@Repository
@ResponseStatus
@AutoConfigureAfter
public interface TeacherRepository extends CrudRepository<Teacher, Long>{
	Teacher findByTeacherId(Long teacherId);
	
}
