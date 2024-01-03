package com.learnJava.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import com.learnJava.dataBase.Student;
import com.learnJava.dataBase.StudentDataBase;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;

public class StreamsFilterExample {

    public static Optional<Student> filterStudents(){

        Optional<Student> filteredStudentList = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .filter(student -> student.getGender().equals("female"))
                .max(Comparator.comparingDouble(Student::getGradeLevel));
//                .collect(toList());

        return filteredStudentList;
    }

    public static void main(String[] args) {

        System.out.println("Filtered Students : " + filterStudents());

    }
}
