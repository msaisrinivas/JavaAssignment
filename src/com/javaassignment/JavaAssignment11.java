package com.javaassignment;

import java.util.HashMap;
import java.io.*;

class FileReadWrite {
    HashMap<Character, Integer> Map=new HashMap<Character, Integer>();

    public void charCount(){
        try {
            FileReader fread=new FileReader("D:\\Zemoso\\readfile.txt");
            int index;
            while((index=fread.read())!=-1) {
                if(!Character.isWhitespace((char)index)) {
                    if(Map.containsKey((char)index)) {
                        Map.put((char)index, Map.get((char)index)+1);
                    }
                    else {
                        Map.put((char)index, 1);
                    }
                }
            }
            writeData();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeData() {
        try {
            File file =new File("D:\\Zemoso\\countfile.txt");
            FileWriter fwrite=new FileWriter(file);
            fwrite.write(Map.toString());
            fwrite.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
};


public class JavaAssignment11 {
    public static void main(String[] args) throws IOException {
        FileReadWrite frw = new FileReadWrite();
        frw.charCount();

        File file =new File("D:\\Zemoso\\countfile.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String lines_in_countfile;
        while ((lines_in_countfile = br.readLine()) != null)
            System.out.println(lines_in_countfile);
    }

}
