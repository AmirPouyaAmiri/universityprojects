package com.company;

import java.util.Scanner;

public  class Amal {
    double num1,num2,res;

    public void amal(){
       Scanner Num1=new Scanner(System.in);
       Scanner Num2=new Scanner(System.in);
       System.out.println("enter first num");
       num1=Num1.nextDouble();
       System.out.println("adade dovom ra vared konid");
       num2=Num2.nextDouble();

       //farakhani method ha
        jam();
        tafrigh();
        zarb();
        taghsim();
   }
   public void jam(){
        res=num1+num2;
       System.out.println("jam ="+res);
   }
   public void tafrigh(){
        if (num1>num2) res=num1-num2;
        else res=num2-num1;
       System.out.println("tafrigh= "+res);
   }
   public void zarb(){
        res=num1*num2;
       System.out.println("zarb= " +res);
   }
   public void taghsim(){
       if (num1>num2) res=num1/num2;
       else res=num2/num1;
       System.out.println("taghsim= " +res);
   }
}
