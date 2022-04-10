package DesignPatterns.BuilderPattern;

import DesignPatterns.BuilderPattern.Items.Item;

import java.util.ArrayList;

public class Meal
{
    ArrayList<Item> mealItems = new ArrayList<Item>();

    void addItem(Item item){
        mealItems.add(item);
    }

    float getCoast()
    {
        float cost = 0;
        for ( Item i : mealItems )
        {
            cost += i.price();
        }
        return cost;
    }

    void showMealItems()
    {
        for ( Item i : mealItems )
        {
            System.out.println("Item : "+i.name()+", Package: "+i.packing().pack()+", Price: $"+i.price());
        }
    }

}
