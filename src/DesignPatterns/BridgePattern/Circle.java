package DesignPatterns.BridgePattern;

public class Circle extends Shape
{

    int x,y,radius;

    public Circle(DrawApi drawApi, int x, int y, int radius)
    {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Draw a circle with: X: "+x+", Y: "+y+", Radius:"+radius);
    }

    @Override
    public void drawWithColor()
    {
        drawApi.drawCircle(x,y,radius);
    }
}
