package com.javaassignment7;

abstract class Cycle{
    public abstract void balance();
};

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing Unicycle is Very hard.");
    }
};

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing Bicycle is Medium");
    }
};

class Tricycle extends Cycle{
    //getting error since Tricycle inherited Cycle but balance() is not declared here.
    // To get rid of this error we can dummy implement the balance()
    @Override
    public void balance() {
    }
};

public class JavaAssignment7Q2 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[0].balance();
        cycles[1] = new Bicycle();
        cycles[1].balance();
        cycles[2] = new Tricycle();
        cycles[2].balance();
    }
}
