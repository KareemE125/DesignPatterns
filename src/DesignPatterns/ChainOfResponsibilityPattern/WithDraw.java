package DesignPatterns.ChainOfResponsibilityPattern;

public abstract class WithDraw
{
    public static final int rank50 = 50;
    public static final int rank20 = 20;
    public static final int rank10 = 10;

    private int rank;
    private WithDraw nextWithDrawer;

    public WithDraw(int rank, WithDraw nextWithDrawer)
    {
        this.rank = rank;
        this.nextWithDrawer = nextWithDrawer;
    }

    public void withDraw(int money)
    {
        while(money >= rank)
        {
            money -= rank;
            System.out.println("withDraw by rank#"+rank+", rest money ("+(money+rank)+"-"+rank+") ==> $"+money);
        }
        if( money > 0 &&  nextWithDrawer != null ){ nextWithDrawer.withDraw(money);  }
    }

}
