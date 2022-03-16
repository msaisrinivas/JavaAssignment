package com.javaassignment;

import java.util.*;

public class JavaAssignment2 {

    public void aToZAlphabets(String line){

        //special chars, numbers and spaces are replaced with nothing.
        line = line.replaceAll("[^a-zA-z]","");

        Set<Character> letters = new HashSet<Character>();

        //adding characters into sets
        for(char l: line.toLowerCase(Locale.ROOT).toCharArray()){
            letters.add(l);
        }

        if(letters.size() == 26){
            System.out.println("Congratulations you have a-z in your string");
        }
        else{
            System.out.println(letters);
        }
    }

    public static void main(String args[]){
        System.out.println("Enter a Line: ");

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        JavaAssignment2 ja2 = new JavaAssignment2();
        ja2.aToZAlphabets(line);

    }
}
