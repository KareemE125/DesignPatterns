package DesignPatterns.BuilderPattern.Items;

import DesignPatterns.BuilderPattern.Packages.Packing;

public interface Item
{
    public String name();
    public Packing packing();
    public float price();
}
