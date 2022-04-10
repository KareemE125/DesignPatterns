package DesignPatterns.AbstractFactoryPattern;

public class NormalFactory extends AbstractFactory
{

    @Override
    public Shape getShape(String shape)
    {
        if(shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else
            return null;
    }
}
