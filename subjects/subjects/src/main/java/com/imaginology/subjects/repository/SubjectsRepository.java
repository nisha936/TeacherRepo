package com.imaginology.subjects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginology.subjects.entity.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository <Subjects, Long>{


}
