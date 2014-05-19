package com.impler.pojbd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Utils
 */
public class TestUtil {

    public static final String INPUT = "input.txt";
    public static final String OUTPUT = "output.txt";
    public static final String NEW_LINE = "\r\n";

    /**
     * 读取IO流
     * @param in
     * @return
     */
    public static String readFile(InputStream in) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line).append(NEW_LINE);
        }
        return sb.toString();
    }

    /**
     * 读取输入
     * @param clazz
     * @return
     * @throws IOException
     */
    public static String readInput(Class<?> clazz) throws IOException {
        return readFile(clazz.getResourceAsStream(INPUT));
    }

    /**
     * 读取输出
     * @param clazz
     * @return
     * @throws IOException
     */
    public static String readOutput(Class<?> clazz) throws IOException {
        return readFile(clazz.getResourceAsStream(OUTPUT));
    }

}
