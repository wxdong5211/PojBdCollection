package com.impler.pojbd.poj1100.poj1004;

import java.util.Scanner;

/**
 * Main 3148K	125MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        float total = 0;
        for (int i = 0; i < 12; i++) {
            total+=cin.nextFloat();
        }
        System.out.println("$"+Math.round(total*100/12)/100f);
    }


}
