package com.impler.pojbd;

/**
 *
 */
public class ExecMonitor {
    private long time;
    public void start(){
        time = System.currentTimeMillis();
    }
    public void stop(){
        System.out.println("exec:"+ (System.currentTimeMillis()-time)+"ms");
    }
}
