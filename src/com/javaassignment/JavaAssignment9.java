package com.javaassignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaAssignment9 {

    public void checkStartEnd(String line){
        if(Pattern.matches("[A-Z].*[.]",line) ){
            System.out.println("Given line started with Capital letter and ended with peroid(.).");
        }
        else{
            System.out.println("Given line doesn't follow the pattern." );
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the line:");
        String line = scan.nextLine();
        JavaAssignment9 ja9 = new JavaAssignment9();
        ja9.checkStartEnd(line);
    }
}
