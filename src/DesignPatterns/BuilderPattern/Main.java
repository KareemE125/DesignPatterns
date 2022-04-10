package DesignPatterns.BuilderPattern;

import DesignPatterns.Helpers;

public class Main
{
    public static void main(String[] args)
    {

        MealBuilder kitchen = new MealBuilder();

        Meal vegMeal = kitchen.prepareVegMeal();
        Meal origMeal = kitchen.prepareOriginalMeal();

        Helpers.printDividor();
        vegMeal.showMealItems();
        Helpers.printDividor();
        origMeal.showMealItems();
        Helpers.printDividor();

    }
}






