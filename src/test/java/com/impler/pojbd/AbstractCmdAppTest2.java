package com.impler.pojbd;

import org.junit.After;
import org.junit.Before;

import java.io.IOException;

/**
 *
 */
public abstract class AbstractCmdAppTest2 {


    protected String input;
    protected String output;
    protected ExecMonitor monitor;
    protected CmdAppExec exec;

    @Before
    public void before() throws IOException {
//        exec = new CmdAppExec(input);
//        monitor = new ExecMonitor();
//        monitor.start();
    }

    @After
    public void after() throws IOException {
//        monitor.stop();
//        exec.destory();
    }

}
