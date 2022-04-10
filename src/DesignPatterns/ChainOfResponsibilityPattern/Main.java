package DesignPatterns.ChainOfResponsibilityPattern;

import DesignPatterns.Helpers;

public class Main
{
    public static void main(String[] args)
    {
        Helpers.printDividor();

        Withdraw10 withdraw10 = new Withdraw10(WithDraw.rank10,null);
        Withdraw20 withdraw20 = new Withdraw20(WithDraw.rank20,withdraw10);
        Withdraw50 withdraw50 = new Withdraw50(WithDraw.rank50,withdraw20);

        withdraw50.withDraw(130);
        //withdraw20.withDraw(130);
        //withdraw10.withDraw(130);

        Helpers.printDividor();
    }
}
