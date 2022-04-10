package DesignPatterns.ChainOfResponsibilityPattern;

public class Withdraw50 extends WithDraw
{
    public Withdraw50(int rank, WithDraw nextWithDrawer)
    {
        super(rank, nextWithDrawer);
    }
}
