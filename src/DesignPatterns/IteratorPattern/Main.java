package DesignPatterns.IteratorPattern;

import DesignPatterns.SingletonPattern.Singleton;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("==> Iterator <==");

        LangSet langSet = new LangSet();
        for (Iterator it = langSet.getIterator(); it.hasNext();)
        {
            System.out.println(it.next());
        }


    }
}
