package com.roth.serverside.repositories;

import com.roth.serverside.models.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, Long> {

    List<CourseStudent> findByCourseInstructorId(Long instructorId);

    List<CourseStudent> findByStudentId(Long studentId);
}
