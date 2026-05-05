package com.studentattendance.attendance.controller;

import com.studentattendance.attendance.entity.StudentAttendance;
import com.studentattendance.attendance.service.StudentAttendanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentAttendanceController {
    private final StudentAttendanceService service;

    public StudentAttendanceController(StudentAttendanceService service) {
        this.service = service;
    }

    @PostMapping
    public void addStudent(@RequestBody StudentAttendance student) {
        service.addStudent(student);

    }

    @GetMapping("/{id}")
    public Optional<StudentAttendance> getStudent(@PathVariable Long id) {
        return service.getById(id);

    }
    @GetMapping
public List<StudentAttendance> findAll()
    {
        return service.findAll();
}
@PutMapping
public void updateStudent(@RequestBody StudentAttendance student)
{
        service.updateStudent(student);
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
        service.deleteStudent(id);
}}


