package com.javaassignment7;


import com.javaassignment7.OuterA.InnerA;

class OuterA {
    OuterA(){
        System.out.println("This is OuterA class constructor");
    }
    class InnerA {
        InnerA(int a){
            System.out.println("The value of a is " +a);
            System.out.println("This is InnerA class constructor");
        }
    }
};

class OuterB extends OuterA{
    OuterB(){
        System.out.println("This is OuterB class constructor");
    }
    class InnerB{
        InnerB(int a){
            System.out.println("The value of a is " +a);
            System.out.println("This is InnerB class constructor");
        }
    }
};


public class JavaAssignment7Q5 {
    public static void main(String[] args) {

        OuterB.InnerB ob = new OuterB().new InnerB(5);
    }
}
