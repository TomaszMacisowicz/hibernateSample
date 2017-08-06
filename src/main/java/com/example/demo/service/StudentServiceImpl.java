/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAC
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void add(Student student) {
        studentRepository.save(student);
        //tak samo robi sie update
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.delete(id);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
