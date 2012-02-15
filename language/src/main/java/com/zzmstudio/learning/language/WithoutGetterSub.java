package com.zzmstudio.learning.language;

/**
 * Created by IntelliJ IDEA.
 * User: gaob
 * Date: 2/14/12
 * Time: 4:08 PM
 * <p/>
 * The parent class has no getter for the private member, "name". The subclass re-declare it, which may introduce a few hidden mistakes.
 */
public class WithoutGetterSub extends WithoutGetter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
