package DesignPatterns.BridgePattern;


import DesignPatterns.Helpers;

public class Main {
    public static void main(String[] args) {
        System.out.println("==> Bridge Pattern <==");

        DrawApi redDrawApi = new RedCircle();
        Circle redCircle = new Circle(redDrawApi,10,5,12);
        redCircle.draw();
        Helpers.printDividor();
        redCircle.drawWithColor();

        Helpers.printDividor();
        Helpers.printDividor();
        DrawApi greenDrawApi = new GreenCircle();
        Circle greenCircle = new Circle(greenDrawApi,0,0,10);
        greenCircle.draw();
        Helpers.printDividor();
        greenCircle.drawWithColor();

    }
}
