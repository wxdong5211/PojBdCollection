package com.impler.pojbd.poj1100.poj1002;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Main 11652K	4954MS
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int row = cin.nextInt();
        if(row==0) {
            System.out.println("No duplicates.");
            return;
        }
        cin.nextLine();
        Map<String,Integer> result = new TreeMap<String, Integer>();
        String line=null;
        Integer times = null;
        for(int i=0;i<row;i++){
            line = getLineNum(cin.nextLine());
            times = result.get(line);
            if(times==null){
                result.put(line,1);
            }else{
                result.put(line,times+1);
            }
        }
        printResult(result);
    }

    public static String getLineNum(String line){
        char[] orgs = line.toCharArray(),result = new char[8];
        int len = orgs.length,index = 0;
        for(int i=0;i<len;i++){
            if(orgs[i]=='-')continue;
            if(index==3){
                result[index] = '-';
                i--;
            }else{
                result[index] = getNum(orgs[i]);
            }
            index++;
        }
        return new String(result);
    }

    public static char getNum(char org){
        if(org<='9')return org;
        if(org<='C')return '2';
        if(org<='F')return '3';
        if(org<='I')return '4';
        if(org<='L')return '5';
        if(org<='O')return '6';
        if(org<='S')return '7';
        if(org<='V')return '8';
        if(org<='Y')return '9';
        return org;
    }

    public static void printResult(Map<String,Integer> result){
        if(result.size()==0){
            System.out.println("No duplicates.");
            return;
        }
        int total=0,times=0;
        for(Map.Entry<String,Integer> e : result.entrySet()){
            times = e.getValue();
            if(times>1){
                total+=1;
                System.out.println(e.getKey()+" "+times);
            }
        }
        if(total==0){
            System.out.println("No duplicates.");
            return;
        }
    }

}
