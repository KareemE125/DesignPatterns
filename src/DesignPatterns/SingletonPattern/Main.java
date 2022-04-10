package DesignPatterns.SingletonPattern;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("==> HELLO <==");

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
        singleton1.print();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        singleton2.print();

    }
}
