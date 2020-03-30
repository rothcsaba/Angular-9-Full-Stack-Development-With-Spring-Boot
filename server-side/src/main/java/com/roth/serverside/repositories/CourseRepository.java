package com.roth.serverside.repositories;

import com.roth.serverside.models.Course;
import com.roth.serverside.models.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<CourseStudent> findByCourseInstructorId(Long instructorId);
}
