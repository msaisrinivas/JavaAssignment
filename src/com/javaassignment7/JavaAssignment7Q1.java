package com.javaassignment7;
abstract class Rodent{
    void Rodent(){
        System.out.println("Rodent is created.");
    }
    public abstract void play();
    public abstract void whatImI();
};

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Mouse is created");
    }
    public void play(){
        System.out.println("Mouse is playing catch-catch.");
    }
    public void whatImI(){
        System.out.println("I am Mouse. ");
    }
};

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil is created");
    }
    public void play(){
        System.out.println("Gerbil is playing Hide and seek");
    }
    public void whatImI(){
        System.out.println("I am Gerbil.");
    }
};

class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster is created");
    }
    public void play(){
        System.out.println("Hamster is playing Find food");
    }
    public void whatImI(){
        System.out.println("I am Hamster. ");
    }
};

public class JavaAssignment7Q1 {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        rodent[0].play();
        rodent[0].whatImI();
        rodent[1].play();
        rodent[1].whatImI();
        rodent[2].play();
        rodent[2].whatImI();
    }

}
