package com.javaassignment12;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void getDepartments(List<Student> studentList){
        studentList.stream().map(Student::getEngDepartmant).distinct().forEach(System.out::println);
    }
    public static void getStudentsEnrolledAfter2018(List<Student> studentList){
        studentList.stream().filter(student -> student.getYearOfEnrollment() > 2018).forEach(System.out::println);
    }
    public  static void getMaleDetailsInCSE(List<Student> studentList){
        studentList.stream().filter(student -> student.getEngDepartmant().equals("Computer Science") && student.getGender().equals("Male")).forEach(System.out::println);
    }
    public static void getMaleAndFemaleCount(List<Student> studentList){
        int maleCount=(int)studentList.stream().filter(student -> student.getGender().equals("Male")).count();
        int femaleCount=(int)studentList.stream().filter(student -> student.getGender().equals("Female")).count();

        System.out.println("MaleCount : "+maleCount);
        System.out.println("FemaleCount : "+femaleCount);
    }
    public static void getAverage(List<Student> studentList){
        Double femaleAverageAge=studentList.stream().filter(student -> student.getGender().equals("Female")).mapToInt(Student::getAge).average().getAsDouble();
        Double maleAverageAge=studentList.stream().filter(student -> student.getGender().equals("Male")).mapToInt(Student::getAge).average().getAsDouble();

        System.out.println("Average age of male students : "+maleAverageAge);
        System.out.println("Average age of Female students : "+femaleAverageAge);
    }
    public static void getStudentWithHighestPercentage(List<Student> studentList){
        Student student=studentList.stream().max(Comparator.comparing(Student::getPerTillDate)).orElse(null);
        System.out.println(student.toString());
    }

    public  static void getStudentsInEachDepartment(List<Student> studentList){
        Map<String, Long> studentCountByDepartment=studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartmant, Collectors.counting()));
        studentCountByDepartment.forEach((department,count)-> System.out.println(department+" has "+count+" students"));
    }

    public static void getAveragePercentageInEachDepartment(List<Student> studentList){
        Map<String,Double> AveragePercentageByDepartment=studentList.stream(). collect(Collectors.groupingBy(Student::getEngDepartmant,Collectors.averagingDouble(Student::getPerTillDate)));
        AveragePercentageByDepartment.forEach((department,average)-> System.out.println(department+" has "+average+" percentage Average"));
    }

    public static void getDetailsOfYoungestMaleInElectronic(List<Student> studentList){
        Student student=studentList.stream().filter(student1 -> student1.getEngDepartmant().equals("Electronic") && student1.getGender().equals("Male")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).orElse(null);
        System.out.println(student.toString());
    }

    public static void getMaleAndFemaleCountInCSE(List<Student> studentList) {
        long maleCount = studentList.stream().filter(student -> student.getGender().equals("Male") && student.getEngDepartmant().equals("Computer Science")).count();
        long femaleCount = studentList.stream().filter(student -> student.getGender().equals("Female") && student.getEngDepartmant().equals("Computer Science")).count();

        System.out.println("No of male students in CSE : " + maleCount);
        System.out.println("No of female students in CSE : " + femaleCount);
    }
}
