package com.impler.pojbd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * PojScan
 */
public class PojScan {

    public static List<PojBean> parseFile(Class<?> clazz) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(clazz.getResourceAsStream("io1010.txt")));
        String line;
        List<PojBean> list = new ArrayList<PojBean>();
        PojBean bean = null;
        boolean needIn = false;
        boolean needOut = false;
        while((line = br.readLine())!=null){
            if(line.startsWith("##POJ")){
                bean = new PojBean();
                list.add(bean);
                bean.setClazz(line.substring("##POJ".length(),line.lastIndexOf("->")));
                bean.setMethod(line.substring(line.lastIndexOf("->")+2));
                needIn = true;
                needOut = false;
            }else if(needIn){
                if(line.startsWith("#->")){
                    needIn = false;
                    needOut = true;
                }else{
                    if(bean.getInput()==null){
                        bean.setInput(line);
                    }else{
                        bean.setInput(bean.getInput()+'\n'+line);
                    }
                }
            }else if(needOut){
                if(bean.getOutput()==null){
                    bean.setOutput(line);
                }else{
                    bean.setOutput(bean.getOutput()+'\n'+line);
                }
            }
        }
        return list;
    }

}
