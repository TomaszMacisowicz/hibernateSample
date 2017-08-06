/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.Collection;

/**
 *
 * @author MAC
 */
public interface StudentService {

    void add(Student student);

    void deleteStudentById(Long id);

    Student getStudentById(Long id);

    void updateStudent(Student student);

    Collection<Student> getAllStudents();

}
