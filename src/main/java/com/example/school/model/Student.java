// Write your code here
package com.example.school.model;

public class Student {

    private int studenId;
    private String studentName;
    private String gender;
    private int standard;

    public Student(int studenId, String studentName, String gender, int standard) {
        this.studenId = studenId;
        this.studentName = studentName;
        this.gender = gender;
        this.standard = standard;
    }

    public int getStudentId() {
        return studenId;
    }

    public void setStudentId(int studenId) {
        this.studenId = studenId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}