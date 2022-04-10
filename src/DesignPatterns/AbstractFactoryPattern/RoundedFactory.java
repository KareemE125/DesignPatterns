package DesignPatterns.AbstractFactoryPattern;


public class RoundedFactory extends AbstractFactory
{

    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("rectangle"))
            return new RoundedRectangle();
        else
            return null;
    }
}
