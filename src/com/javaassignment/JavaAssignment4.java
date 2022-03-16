package com.javaassignment;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaAssignment4 {

    public void FindRange(String sformdate, String scurrentdate){
        LocalDate formdate = LocalDate.parse(sformdate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate currentdate = LocalDate.parse(scurrentdate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        if(formdate.isAfter(currentdate)){
            System.out.println("No range");
        }
        else{
            LocalDate startdate = formdate.withYear(currentdate.getYear()).minusDays(30);
            LocalDate enddate = startdate.plusDays(60);

            if(enddate.isAfter(currentdate)){
                enddate = currentdate;
            }
            System.out.println(startdate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+
                    " "+enddate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
    }

    public static void main(String args[]) throws ParseException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of inputs:");
        int n = scan.nextInt();
        JavaAssignment4 ja4 = new JavaAssignment4();
        while(n>0){
            System.out.println("Enter the form date and current date:");
            String sformdate = scan.next();
            String scurrentdate = scan.next();

            ja4.FindRange(sformdate,scurrentdate);
            n--;
        }
    }
}
