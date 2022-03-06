package com.company.classes.ekhtesasi;

import com.company.Interfaces.Hamniaz;
import com.company.Interfaces.Pishniaz;

public class Riazi2 extends DoroseEkhtesasi implements Pishniaz,Hamniaz {
    @Override
    public void vahed() {
        super.vahed();
    }

    @Override
    public void dorosPishniaz() {
        System.out.println("dorose pishniaz :");
        System.out.println("riazi 1");
    }

    @Override
    public void doroseHamNiaz() {
        System.out.println("in dars hamniaz nadarad");
    }
}
