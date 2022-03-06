package com.company.classes;
import com.company.interfaces.MyInteger;
import java.util.Scanner;

public class Adad  implements MyInteger {
    Scanner scanner=new Scanner(System.in);
    int adad=scanner.nextInt();
    @Override
    public void isEven() {
        if (adad %2 ==0) System.out.println("adad zoj ast");
    }

    @Override
    public void isOdd() {
        if (adad %2 !=0) System.out.println("adad fard ast");

    }

    @Override
    public void isPosetive() {
        if (adad>0) System.out.println("adad mosbat ast");
    }

    @Override
    public void isNegative() {
        if (adad<0) System.out.println("adad manfi ast");

    }

    @Override
    public void isZero() {
        if (adad==0) System.out.println("adad sefr ast");
    }
}
