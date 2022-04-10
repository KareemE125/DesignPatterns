package DesignPatterns.Decorator_WrapperPattern;

import DesignPatterns.Helpers;

public class Main {
    public static void main(String[] args) {
        System.out.println("==> Decorator/Wrapper Pattern <==\n\n");

        Shape Ncircle = new Circle();
        Ncircle.draw();

        Helpers.printDividor();

        Shape Dcircle = new RedBorderShapeDecorator(Ncircle);
        Dcircle.draw();

    }
}
