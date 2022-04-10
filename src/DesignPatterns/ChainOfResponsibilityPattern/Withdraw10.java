package DesignPatterns.ChainOfResponsibilityPattern;

public class Withdraw10 extends WithDraw
{
    public Withdraw10(int rank, WithDraw nextWithDrawer)
    {
        super(rank, nextWithDrawer);
    }
}
