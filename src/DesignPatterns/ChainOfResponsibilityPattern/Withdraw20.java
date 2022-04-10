package DesignPatterns.ChainOfResponsibilityPattern;

public class Withdraw20 extends WithDraw
{
    public Withdraw20(int rank, WithDraw nextWithDrawer)
    {
        super(rank, nextWithDrawer);
    }
}
