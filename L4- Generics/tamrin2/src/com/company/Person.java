package com.company;

public class Person <Hair,Age> implements Cloneable{
    public Hair hairColor;
    public Age ageNum;

    @Override
    protected Object clone()
        throws
            CloneNotSupportedException{
        return super.clone();
    }

}
