package com.javaassignment12;

public class Student {
    private int id,age,yearOfEnrollment;
    private String name,gender,engDepartmant;
    private double perTillDate;
    public Student(int id,String name,int age,String gender,String engDepartmant,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartmant=engDepartmant;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }

    public int getAge(){
        return age;
    }
    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEngDepartmant() {
        return engDepartmant;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", engDepartment='" + engDepartmant + '\'' +
                ", year_of_enrollment=" + yearOfEnrollment +
                ", percentage=" + perTillDate +
                '}';
    }
}
