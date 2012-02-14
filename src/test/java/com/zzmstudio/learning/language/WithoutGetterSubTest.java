package com.zzmstudio.learning.language;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

/**
 * Created by IntelliJ IDEA.
 * User: gaob
 * Date: 2/14/12
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class WithoutGetterSubTest {
    private WithoutGetterSub withoutGetterSub;

    @Before
    public void setUp() {
        withoutGetterSub = new WithoutGetterSub();
    }

    @Test
    public void getName(){
        String expectedName = "TEST";
        withoutGetterSub.setName(expectedName);
        
        String resultName = withoutGetterSub.getName();

        // surprise: the name was not set as expected
        assertNull("The name was not set correctly", resultName);
        
        assertNotSame("The name was not set as " + expectedName, expectedName, resultName);

        assertEquals("The name was not set correctly", expectedName, resultName);
    }
}
