package com.company;

public class Main {

    public static void main(String[] args) {
        Specifications specifications=new Specifications();
        //set for setter
        specifications.setName("AmirPouya");
        specifications.setFamily("Amiri");
        specifications.setAge(18);
        specifications.setPassWord("1111");
        specifications.setUsername("Pouya");
        specifications.setJob("Programer");
        //sout getter
        System.out.println("name: "+specifications.getName());
        System.out.println("Family name: "+specifications.getFamily());
        System.out.println("Age: "+specifications.getAge());
        System.out.println("PassWord: "+specifications.getPassWord());
        System.out.println("Username: "+specifications.getUsername());
        System.out.println("Job: "+specifications.getJob());
    }
}
