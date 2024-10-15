package com.example.springboot3.controller;

import com.example.springboot3.entities.Student;
import com.example.springboot3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private StudentService studentService;

    @PostMapping("/upload")
    public ResponseEntity<Student> uploadEmployee(@RequestParam("pic") MultipartFile file, @RequestParam("name") String s) throws Exception {
        try {
            Student student = studentService.saveStudent(file, s);
            return new ResponseEntity<>(student,HttpStatus.OK);
        } catch (IOException e) {
            throw new Exception("Student details not saved");
        }
    }

    @GetMapping("/{id}/image")
    public ResponseEntity<byte[]> getStudentImage(@PathVariable Long id) {
        Student student = studentService.getStudent(id);
        if (student != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            return new ResponseEntity<>(student.getProfile(), headers, HttpStatus.OK);
        }
        return new ResponseEntity<>(new byte[]{}, HttpStatus.OK);

    }

}

