package DesignPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====>>> Abstract Factory Pattern <<<=====");

        AbstractFactory myFactoryR = FactoryMaker.makeFactory("rounded");
        AbstractFactory myFactoryN = FactoryMaker.makeFactory("noRMal");

        Shape myShape =  myFactoryR.getShape("rectangle");
        myShape.draw();

        myShape = myFactoryN.getShape("rectangle");
        myShape.draw();
    }
}
