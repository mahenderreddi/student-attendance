package com.studentattendance.attendance.repository;

import com.studentattendance.attendance.entity.StudentAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAttendanceRepository  extends JpaRepository<StudentAttendance, Long> {
}
