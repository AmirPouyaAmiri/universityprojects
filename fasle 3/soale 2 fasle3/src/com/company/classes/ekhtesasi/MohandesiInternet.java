package com.company.classes.ekhtesasi;

import com.company.Interfaces.Hamniaz;
import com.company.Interfaces.Pishniaz;

public class MohandesiInternet extends DoroseEkhtesasi implements Hamniaz, Pishniaz {
    @Override
    public void doroseHamNiaz() {
        System.out.println("darse hamniaz: ");
        System.out.println("payegahe dade ha");
    }

    @Override
    public void dorosPishniaz() {
        System.out.println("darse pishniaz: ");
        System.out.println("shabake computeri");
    }

    @Override
    public void vahed() {
        super.vahed();
    }
}
