package DesignPatterns.AbstractFactoryPattern;

public class FactoryMaker
{
    public static AbstractFactory makeFactory(String type)
    {
        if(type.equalsIgnoreCase("rounded"))
            return new RoundedFactory();
        else if(type.equalsIgnoreCase("normal"))
            return new NormalFactory();
        else
            return null;
    }
}
