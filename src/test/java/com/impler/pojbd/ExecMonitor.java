package com.impler.pojbd;

/**
 *
 */
public class ExecMonitor {
    private long time;
    private long memory;
    public void start(){
        memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        time = System.currentTimeMillis();
    }
    public void stop(){
        System.out.println("exec:"+ (System.currentTimeMillis()-time)+"ms,"
                +(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()-memory)/1024+"kb");
    }
}
