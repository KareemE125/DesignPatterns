package DesignPatterns.BridgePattern;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int rad)
    {
        System.out.println("Draw a circle with:[GREEN COLOR USED], X: "+x+", Y: "+y+", Radius:"+rad);
    }
}
