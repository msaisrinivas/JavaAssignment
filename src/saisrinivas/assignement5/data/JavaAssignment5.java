package saisrinivas.assignement5.data;

public class JavaAssignment5 {
    private int variable_int;
    private char variable_char;

    public void print(){
        System.out.println("variable_int: "+variable_int);
        System.out.println("variable_char:"+variable_char);
    }

    public void anotherMethod(){
        //without intializing local variables can't be printed.
        int local_int=10;
        char local_char='a';
        System.out.println("local_int:"+local_int);
        System.out.println("local_char:"+local_char);
    }

}
