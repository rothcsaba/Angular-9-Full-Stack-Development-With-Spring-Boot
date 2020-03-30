package com.roth.serverside.services;

import com.roth.serverside.models.Course;

import java.util.List;

public interface CourseService {

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
