package com.impler.pojbd.poj1100.poj1006;

import java.util.Scanner;

/**
 * Main 3928K	5360MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int p,e,i,d,idx = 0,t;
        while(cin.hasNext()){
            p = cin.nextInt();
            e = cin.nextInt();
            i = cin.nextInt();
            d = cin.nextInt();
            if(p==-1&&e==-1&&i==-1&&d==-1){
                break;
            }
            idx++;
            t = (5544*p+14421*e+1288*i)%21252-d;
            System.out.println("Case "+idx+": the next triple peak occurs in "+(t<1?21252+t:t)+" days.");
        }
    }


}
