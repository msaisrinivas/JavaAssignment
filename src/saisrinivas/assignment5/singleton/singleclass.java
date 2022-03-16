package saisrinivas.assignment5.singleton;

public class singleclass {
    private String str;

    public void printStr(){
        System.out.println("String: "+str);
    }

    public static singleclass function(String str_parameter){
        //static functions can access only static varables.
        singleclass sincl = new singleclass();
        sincl.str = str_parameter;
        return sincl;
    }

}
