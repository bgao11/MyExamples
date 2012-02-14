package com.zzmstudio.learning.language;

/**
 * Created by IntelliJ IDEA.
 * User: gaob
 * Date: 2/14/12
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class WithoutGetterSub extends WithoutGetter{
    private String name;

    public void printName(){
        System.out.println("My Name is " + name);
        System.out.println("My Getter Name is " + this.getName());
    }

    public String getName() {
        return name;
    }
}
