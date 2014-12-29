package com.impler.pojbd.poj1100.poj1007;

import java.util.Scanner;

/**
 * Main 3364K	1547MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n = cin.nextInt(),m = cin.nextInt();
        String[] org = new String[m];
        int[][] idx = new int[m][2];
        for (int i = 0; i < m; i++) {
            org[i] = cin.next();
            int c=0,g=0,t=0,x=0;
            for (int j = n-1; j >= 0 ; j--) {
                switch (org[i].charAt(j)){
                    case 'A':c++;g++;t++;break;
                    case 'C':g++;t++;x+=c;break;
                    case 'G':t++;x+=g;break;
                    case 'T':x+=t;break;
                }
            }
            idx[i] = new int[]{x,i};
        }
        int[] temp;
        for (int i = 0; i < m-1; i++) {
            for (int j = i+1; j < m; j++) {
                if(idx[j][0]<idx[i][0]){
                    temp = idx[i];
                    idx[i] =idx[j];
                    idx[j] = temp;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(org[idx[i][1]]);
        }

    }


}
