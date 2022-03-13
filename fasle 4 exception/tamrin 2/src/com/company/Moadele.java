package com.company;

import java.util.Scanner;

public class Moadele extends Exception  {
    public Moadele(String msg){
            super(msg);
    }
    public Moadele(){}
    public void zarib() throws Moadele {
        Scanner zaribA=new Scanner(System.in);
        Scanner zaribB=new Scanner(System.in);
        Scanner zaribC=new Scanner(System.in);

        System.out.println(" tebgeh moadele ax^2+bx+c=0 zarayebe a,b,c ra vared namayiid");
        System.out.println("zarribe a");
        double a=zaribA.nextDouble();
        System.out.println("zarribe b");
        double b=zaribB.nextDouble();
        System.out.println("zarribe c");
        double c=zaribC.nextDouble();
        double d=(b*b)-(4*a*c);
        if (d<0){
            throw new Moadele("dar in moadele delta<0 -> javab nadarad");
        }
        if (d==0){
            double risheMozaaf=(-b)/(a);
            System.out.println("rishe mozaf =" +risheMozaaf);
        }
        else {
            double rishe1=((-b)+Math.sqrt(d)/(4*a));
            double rishe2=((-b)-Math.sqrt(d)/(4*a));
            System.out.println("rishe 1=" +rishe1);
            System.out.println("rishe 2="+rishe2);
        }


    }
}
