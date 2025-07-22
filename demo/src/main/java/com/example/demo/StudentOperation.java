package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StudentOperation {

List<StudentData> studentDataList = Arrays.asList(
        new StudentData(11,"rishi","mail.com"),
        new StudentData(22,"rishi2","mail.com"),
        new StudentData(33,"rishi3","mail.com")
);


void addStudentData(StudentData studentData) {
studentDataList.add(studentData);
}

List<StudentData> getStudentDataList() {
    return studentDataList;
}








}
