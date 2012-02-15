package com.zzmstudio.learning.language;

/**
 * Created by IntelliJ IDEA.
 * User: gaob
 * Date: 2/14/12
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class WithoutGetter {
    private String name;
    
    public void printName(){
        System.out.println("My Name is " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
