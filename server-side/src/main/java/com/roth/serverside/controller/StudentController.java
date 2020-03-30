package com.roth.serverside.controller;

import com.roth.serverside.model.Course;
import com.roth.serverside.model.CourseStudent;
import com.roth.serverside.service.CourseStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    @Autowired
    private CourseStudentService courseStudentService;

    @GetMapping("/api/student/courses/{studentId}")
    public ResponseEntity<?> findAllCoursesOfStudent(@PathVariable Long studentId) {
        List<Course> courseList =
                courseStudentService.findAllCoursesOfStudent(studentId).stream()
                        .map(cs -> cs.getCourse())
                        .collect(Collectors.toList());
        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }

    @PostMapping("/api/student/enroll")
    public ResponseEntity<?> enroll(@RequestBody CourseStudent courseStudent) {
        return new ResponseEntity<>(courseStudentService.saveCourseStudent(courseStudent), HttpStatus.CREATED);
    }
}
