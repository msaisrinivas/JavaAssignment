package com.javaassignment7;

interface Cycle4{
    void code();
    void factories();

}
class Unicycle4 implements Cycle4{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("This factory is making Unicycle");
    }

};
class Bicycle4 implements Cycle4{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("This factory is making Bicycle");
    }
};
class Tricycle4 implements Cycle4{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("This factory is making Tricycle");
    }
};

public class JavaAssignment7Q4 {
    public static void main(String[] args){
        Cycle4 cy = new Unicycle4();
        cy.code();
        cy = new Bicycle4();
        cy.code();
        cy= new Tricycle4();
        cy.code();
    }
}
