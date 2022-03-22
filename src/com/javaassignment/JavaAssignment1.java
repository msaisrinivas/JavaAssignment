package com.javaassignment;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class JavaAssignment1 {

    public void findfile(String search){
        //base directory path.
        File directory = new File("C:\\Users\\saisrinivas");

        //fetching filenames filtered by search word
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.contains(search)) {
                    return true;
                }
                return false;
            }
        };
        File[] files = directory.listFiles(filter);
        System.out.println(directory);
        for (File f : files) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JavaAssignment1 ja1 = new JavaAssignment1();

        do {
            System.out.println("Enter the file name wanted search : ");
            String search = scan.next();

            ja1.findfile(search);
        }while(true);
    }
}
