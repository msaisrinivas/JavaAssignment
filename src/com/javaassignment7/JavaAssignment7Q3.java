package com.javaassignment7;

import java.util.Scanner;
interface A{
    public void getA();
    public void dispA();
}
interface B{
    public void getB();
    public void dispB();
}
interface C{
    public void getC();
    public void dispC();

}
interface D extends A,B, C{
    public void getD();

}
class E implements D{
    public void getA(){
        System.out.println("interface A get method");
    }
    public void dispA(){
        System.out.println("interface A disp method");
    }
    public void getB(){
        System.out.println("interface B get method");
    }
    public void dispB(){
        System.out.println("interface B disp method");
    }
    public void getC(){
        System.out.println("interface C get method");
    }
    public void dispC(){
        System.out.println("interface C disp method");
    }
    public void getD(){
        System.out.println("interface D get mehtod ");
    }
};

public class JavaAssignment7Q3 {
    static void methodA(A i) {
        i.dispA();
        i.getA();
        System.out.println("Done with Method A*******");
    };
    static void methodB(B i) {
        i.dispB();
        i.getB();
        System.out.println("Done with Method B*******");
    };
    static void methodC(C i) {
        i.dispC();
        i.getC();
        System.out.println("Done with Method C*******");
    };
    static void methodD(D i) {
        i.getD();
        i.getA();
        i.getB();
        i.getC();
        i.dispA();
        i.dispB();
        i.dispC();
        System.out.println("Done with Method E*******");
    };

    public static void main(String[] args) {
        //Even though passing E object according to method they are chaging the object to A,B,C and D.
        E s = new E();
        methodA(s);
        methodB(s);
        methodC(s);
        methodD(s);

    }
}
