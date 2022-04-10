package DesignPatterns.Decorator_WrapperPattern;

import DesignPatterns.BridgePattern.DrawApi;

public class Circle implements Shape {

    @Override
    public void draw()
    {
        System.out.println("Draw a circle");
    }


}
