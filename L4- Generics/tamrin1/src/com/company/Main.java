package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        Scanner shomareDaneshjoo=new Scanner(System.in);
        Scanner moadeleKol=new Scanner(System.in);
        Map daneshjoo=new HashMap();
        System.out.println("name daneshjoo");
        daneshjoo.put("Name","name: "+name.next());
        System.out.println("shomare daneshjooii");
        daneshjoo.put("Shomare daneshjoo","shomare daneshjooii: "+shomareDaneshjoo.nextInt());
        System.out.println("moadele kole daneshjoo");
        daneshjoo.put("moadele Kol","moadele kol: "+moadeleKol.nextDouble());
        ArrayList<Integer> value=new ArrayList<>(daneshjoo.values());
        for(int i= value.size()-1;i>=0;i--){
            System.out.println(value.get(i));
        }
    }
}
