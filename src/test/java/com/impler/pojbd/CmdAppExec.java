package com.impler.pojbd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 */
public class CmdAppExec {

    private PrintStream ps;
    private PrintStream old;
    private ByteArrayOutputStream baos;
    private ByteArrayInputStream bais;

    public CmdAppExec(String input){
        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
        old = System.out;
        bais = new ByteArrayInputStream(input.getBytes());
    }

    public String execute(CmdAppCallBack callback){
        System.setOut(ps);
        System.setIn(bais);
        callback.run();
        System.setOut(old);
        return baos.toString();
    }

    public void destory() throws IOException {
        ps.close();
        bais.close();;
        old = null;
    }

    public static interface CmdAppCallBack{
        void run();
    }

}
