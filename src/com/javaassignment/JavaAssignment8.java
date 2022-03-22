package com.javaassignment;

class invalidCN extends Exception{
    public invalidCN(String str){
        super(str);
    }
};

class invalidCVV extends Exception{
    public invalidCVV(String str){
        super(str);
    }
};

class invalidOTP extends Exception{
    public invalidOTP(String str){
        super(str);
    }
};


class Check extends Exception{

    public void CheckCreditDetails(String card_number,String cvv,String otp)throws invalidCN,invalidCVV,invalidOTP {

        if(card_number.length()!=16){
            throw new invalidCN("Please Enter the correct Card Number");
        }
        if(cvv.length()!=3)
        {
            throw new invalidCVV("Please Enter the correct CVV number");
        }
        if(otp.length()!=4){
            throw new invalidOTP("Please Enter the correct OTP");
        }
    }
};

class JavaAssignement8 {

    public static void main(String[] args) {

        try {
            Check ch = new Check();
            ch.CheckCreditDetails("1596753214789632","329","5555");
        }
        catch(invalidCN | invalidCVV | invalidOTP ex_msg) {
            System.out.println(ex_msg.getMessage());
        }
        finally {
            System.out.println("Exceptions are done and entered in finally");
        }

    }

}