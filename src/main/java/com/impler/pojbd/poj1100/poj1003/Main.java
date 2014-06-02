package com.impler.pojbd.poj1100.poj1003;

import java.util.Scanner;

/**
 * Main 3144K	157MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        double x = 0;
        while(cin.hasNext()){
            x = cin.nextDouble();
            if(x==0)return;
            System.out.println(getCardNum(x)+" card(s)");
        }
    }

    public static int getCardNum(double len){
        int n=1;
        double sum = 0;
        while(sum<len){
            sum+=1d/(n+1);
            n++;
        }
        return n-1;
    }

}
