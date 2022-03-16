package saisrinivas.assignment5.main;

import saisrinivas.assignement5.data.JavaAssignment5;
import saisrinivas.assignment5.singleton.singleclass;

public class Main {
    public static void main(String args[]){
        JavaAssignment5 ja5 = new JavaAssignment5();
        ja5.anotherMethod();
        ja5.print();

        singleclass sc = singleclass.function("Hello World!! Sai Srinivas");
        sc.printStr();
    }
}
