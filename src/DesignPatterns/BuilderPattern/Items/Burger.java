package DesignPatterns.BuilderPattern.Items;

import DesignPatterns.BuilderPattern.Packages.Packing;
import DesignPatterns.BuilderPattern.Packages.Wrapper;

public abstract class Burger implements Item
{
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
