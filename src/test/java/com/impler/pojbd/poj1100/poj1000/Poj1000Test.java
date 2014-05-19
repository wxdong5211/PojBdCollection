package com.impler.pojbd.poj1100.poj1000;

import com.impler.pojbd.AbstractCmdAppTest;
import com.impler.pojbd.CmdAppExec;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test
 */
public class Poj1000Test extends AbstractCmdAppTest {

    @Test(timeout = 1000)
    public void testMain(){
        Assert.assertEquals(output,exec.execute(new CmdAppExec.CmdAppCallBack() {
            public void run() {
                Main.main(null);
            }
        }));
    }

}
