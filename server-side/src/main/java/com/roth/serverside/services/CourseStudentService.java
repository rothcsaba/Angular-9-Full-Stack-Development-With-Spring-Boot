package com.roth.serverside.services;

import com.roth.serverside.models.CourseStudent;

import java.util.List;

public interface CourseStudentService {

    CourseStudent saveCourseStudent(CourseStudent courseStudent);

    List<CourseStudent> findAllCoursesOfStudent(Long studentId);

    List<CourseStudent> findAllStudentsOfInstructor(Long instructorId);

    List<CourseStudent> findAllEnrollments();
}
