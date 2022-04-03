package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner hair=new Scanner(System.in);
        Scanner age=new Scanner(System.in);
        Person p1=new Person();
        System.out.println("enter your hair color");
        p1.hairColor=hair.next();
        System.out.println("enter your age");
        p1.ageNum=age.nextInt();
        Person p2=null;
        Person p3=null;
        try {
            p2=(Person) p1.clone();
            p3=(Person) p1.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("clone support nemishavad");
        }
        if (!p1.equals(p2)){
            //hair color
            System.out.println("mooye karbare aval: "+p1.hairColor);
            System.out.println("mooye hamzad dovom: "+p2.hairColor);
            System.out.println("mooye hamzad sevom: "+p3.hairColor);
            //fasele
            System.out.println();
            //age num
            System.out.println("sene karbare aval: "+p1.ageNum);
            System.out.println("sene hamzad dovom: "+p2.ageNum);
            System.out.println("sene hamzad sevom: "+p3.ageNum);
        }
    }
}
