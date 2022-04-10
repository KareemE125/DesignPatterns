package DesignPatterns.AbstractFactoryPattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Normal Rectangle");
    }
}
