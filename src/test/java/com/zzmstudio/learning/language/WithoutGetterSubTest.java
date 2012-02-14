package com.zzmstudio.learning.language;

import org.junit.Before;
import org.junit.Test;

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
    public void printName(){
        withoutGetterSub.setName("TEST");

        withoutGetterSub.printName();
    }
}
