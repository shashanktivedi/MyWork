package com.learnJava.methodreferences;

import java.util.function.Supplier;

import com.learnJava.dataBase.Student;

public class SupplierMethodReferenceExample {

    Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println();

    }
}
