package com.javaassignment6;

public class JavaAssignment6Q2 {
    JavaAssignment6Q2() {
        System.out.println("I don't take parameters");
    }
    JavaAssignment6Q2(String str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        JavaAssignment6Q2 obj = new JavaAssignment6Q2("Hello!");
    }
}
