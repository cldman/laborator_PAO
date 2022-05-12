package com.example.lab12.service;

import com.example.lab12.model.Student;
import com.example.lab12.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public Student addStudent(Student student){
        return repository.save(student);
    }
    public Student getStudentById(Long id){
        return repository.getById(id);
    }

}
