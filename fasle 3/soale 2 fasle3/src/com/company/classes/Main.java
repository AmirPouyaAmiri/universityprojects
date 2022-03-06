package com.company.classes;
import com.company.classes.ekhtesasi.MohandesiInternet;
import com.company.classes.ekhtesasi.Riazi2;
import com.company.classes.omomi.TafsireQuran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Riazi2 riazi2=new Riazi2();
        MohandesiInternet mohandesiInternet=new MohandesiInternet();
        TafsireQuran tafsireQuran=new TafsireQuran();
        Scanner doros=new Scanner(System.in);
        System.out.println("name darse khod ra vared konid");
        String dars=doros.next();
        switch (dars){
            case "riazi2":
                riazi2.dorosPishniaz();
                riazi2.doroseHamNiaz();
                riazi2.vahed();
                break;
            case "mohandesiInternet":
                mohandesiInternet.doroseHamNiaz();
                mohandesiInternet.dorosPishniaz();
                mohandesiInternet.vahed();
                break;
            case "tafsireQuran":
                tafsireQuran.dorosPishniaz();
                tafsireQuran.doroseHamNiaz();
                tafsireQuran.vahed();
                break;
            default:
                System.out.println("in dars vojod nadarad ya eshtebah vared kardeiid");

        }

    }
}
