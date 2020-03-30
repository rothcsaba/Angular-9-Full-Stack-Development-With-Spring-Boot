package com.roth.serverside.services;

import com.roth.serverside.models.CourseStudent;
import com.roth.serverside.repositories.CourseStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseStudentServiceImp implements CourseStudentService {

    @Autowired
    private CourseStudentRepository courseStudentRepository;

    @Override
    public CourseStudent saveCourseStudent(CourseStudent courseStudent) {
        return courseStudentRepository.save((courseStudent));
    }

    @Override
    public List<CourseStudent> findAllCoursesOfStudent(Long studentId) {
        return courseStudentRepository.findByStudentId(studentId);
    }

    @Override
    public List<CourseStudent> findAllStudentsOfInstructor(Long instructorId) {
        return courseStudentRepository.findByCourseInstructorId(instructorId);
    }

    @Override
    public List<CourseStudent> findAllEnrollments() {
        return courseStudentRepository.findAll();
    }
}
