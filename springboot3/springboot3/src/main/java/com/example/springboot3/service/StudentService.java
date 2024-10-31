package com.example.springboot3.service;

import com.example.springboot3.entities.Student;
import com.example.springboot3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student saveStudent(MultipartFile file,String s) throws IOException {

        Student student = new Student();
        student.setName(s);


        student.setProfile(file.getBytes());
        return studentRepository.save(student);
    }
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

}
