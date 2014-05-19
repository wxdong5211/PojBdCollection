package com.impler.pojbd.poj1100.poj1001;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Main 3388K	172MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        BigDecimal org = null;
        int pow =0;
        while(cin.hasNext()){
            org = cin.nextBigDecimal();
            pow=cin.nextInt();
            System.out.println(pow==0 ? "1": (org.compareTo(BigDecimal.valueOf(0l))==0 ?"0":org.pow(pow).stripTrailingZeros().toPlainString().replaceAll("^0\\.", ".")));
        }
    }

}
