package com.zzmstudio.learning.framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: gaob
 * Date: 2/15/12
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleTestNGExampleTest {
    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }

}
