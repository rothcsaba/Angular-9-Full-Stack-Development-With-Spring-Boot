package com.roth.serverside.repository;

import com.roth.serverside.model.Course;
import com.roth.serverside.model.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<CourseStudent> findByCourseInstructorId(Long instructorId);
}
