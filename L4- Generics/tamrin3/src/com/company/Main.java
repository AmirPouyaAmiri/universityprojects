package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Daneshjoo daneshjoo=new Daneshjoo();

        Scanner name=new Scanner(System.in);
        Scanner shomareDaneshjooii=new Scanner(System.in);
        Scanner fathersName=new Scanner(System.in);

        System.out.println("enter your name");
        daneshjoo.name=name.next();

        System.out.println("enter shomare daneshjooii");
        daneshjoo.shomareDaneshjooii=shomareDaneshjooii.nextInt();

        System.out.println("enter your fathers name");
        daneshjoo.fathersName=fathersName.next();


        ArrayList<String> nomre=new ArrayList<>();
        Scanner Nomre=new Scanner(System.in);

        System.out.println("enter your riazi1 nomre");
        daneshjoo.setNomre(Nomre.nextDouble());
        nomre.add("riazi1 nomre: "+daneshjoo.getNomre());

        System.out.println(" enter your fizik1 nomre");
        daneshjoo.setNomre(Nomre.nextDouble());
        nomre.add("fizik1 nomre: "+daneshjoo.getNomre());

        System.out.println(" enter your gosaste nomre");
        daneshjoo.setNomre(Nomre.nextDouble());
        nomre.add("gosaste nomre: "+daneshjoo.getNomre());

        System.out.println(" enter your andishe1 nomre");
        daneshjoo.setNomre(Nomre.nextDouble());
        nomre.add("andishe1 nomre: "+daneshjoo.getNomre());

        System.out.println(" enter your fizik2 nomre");
        daneshjoo.setNomre(Nomre.nextDouble());
        nomre.add("fizik2 nomre: "+daneshjoo.getNomre());

        System.out.println("name: "+daneshjoo.name);
        System.out.println("shomare daneshjooii: "+daneshjoo.shomareDaneshjooii);
        System.out.println("fathers name: "+daneshjoo.fathersName);
        System.out.println();
        for (Object o: nomre) {
            System.out.println(o);
        }
    }
}
