package DesignPatterns.BridgePattern;

public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int x, int y, int rad)
    {
        System.out.println("Draw a circle with:[RED COLOR USED], X: "+x+", Y: "+y+", Radius:"+rad);
    }
}
