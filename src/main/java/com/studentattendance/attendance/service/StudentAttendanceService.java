package com.studentattendance.attendance.service;

import com.studentattendance.attendance.entity.StudentAttendance;
import com.studentattendance.attendance.repository.StudentAttendanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAttendanceService {
    private final StudentAttendanceRepository repository;
    public StudentAttendanceService(StudentAttendanceRepository repository){
        this.repository = repository;
    }

    public void addStudent(StudentAttendance student){
         repository.save(student);
    }
    public Optional<StudentAttendance> getById(Long id) {
        return repository.findById(id);
    }
//public List<StudentAttendance> findAll(){
//        return  repository.findAll()
//;
//    }
    public void updateStudent(StudentAttendance student){
        repository.save(student);

    }

public void deleteStudent(Long id){
        repository.deleteById(id) ;
}


    }

