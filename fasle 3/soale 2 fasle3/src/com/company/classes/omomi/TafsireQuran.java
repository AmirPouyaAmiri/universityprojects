package com.company.classes.omomi;

import com.company.Interfaces.Hamniaz;
import com.company.Interfaces.Pishniaz;

public class TafsireQuran extends DoroseOmomi implements Hamniaz, Pishniaz {
    @Override
    public void doroseHamNiaz() {
        System.out.println("in dars hamniaz nadarad");
    }

    @Override
    public void dorosPishniaz() {
        System.out.println("in dars pishniaz nadarad");
    }

    @Override
    public void vahed() {
        super.vahed();
    }
}
