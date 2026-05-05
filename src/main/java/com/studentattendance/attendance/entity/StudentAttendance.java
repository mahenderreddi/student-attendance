package com.studentattendance.attendance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentAttendance {
@Id
    private Long studentId;

    @Override
    public String toString() {
        return "StudentAttendance{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", totalClasses=" + totalClasses +
                ", attendedClasses=" + attendedClasses +
                '}';
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public void setTotalClasses(int totalClasses) {
        this.totalClasses = totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public void setAttendedClasses(int attendedClasses) {
        this.attendedClasses = attendedClasses;
    }

    private String studentName;
    private int totalClasses;
    private int attendedClasses;
}
