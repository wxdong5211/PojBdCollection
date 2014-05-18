package com.impler.pojbd.poj1100.poj1002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Main 3388K	172MS
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
        Map<String,Integer> dict = getDict();
        Map<String,Integer> result = new TreeMap<String, Integer>();
        String line=null;
        Integer times = null;
        for(int i=0;i<row;i++){
            line = getLineNum(cin.nextLine(), dict);
            times = result.get(line);
            if(times==null){
                result.put(line,1);
            }else{
                result.put(line,times+1);
            }
        }
        printResult(result);
    }

    public static Map<String,Integer> getDict(){
        Map<String,Integer> dict = new HashMap<String, Integer>();
        char start = 'A';
        for(int i=0;i<25;i++){
            if(i==16)continue;
            dict.put("" + (char)(start+i), ((i>16?(i-1)/3:i/3)+2)+'0');
        }
        return dict;
    }

    public static String getLineNum(String line,Map<String,Integer> dict){
        char[] result = line.replaceAll("\\-","").toCharArray();
        int len = result.length;
        for(int i=0;i<len;i++){
            if(result[i]>='A'){
                result[i] = (char)dict.get(result[i]+"").intValue();
            }
        }
        String nums = new String(result);
        return nums.substring(0,3)+'-'+nums.substring(3);
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
