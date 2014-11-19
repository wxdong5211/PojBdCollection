package com.impler.pojbd.poj1100.poj1005;

import java.util.Scanner;

/**
 * Main 3232K	157MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int row = cin.nextInt();
        float x,y;
        for (int i = 0; i < row; i++) {
            x = cin.nextFloat();
            y = cin.nextFloat();
            System.out.println("Property "+(i+1)+": This property will begin eroding in year "+((int)(Math.PI*(x*x+y*y))/100+1)+".");
        }
        System.out.println("END OF OUTPUT.");
    }


}
