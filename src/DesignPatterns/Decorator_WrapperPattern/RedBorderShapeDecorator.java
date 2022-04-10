package DesignPatterns.Decorator_WrapperPattern;

public class RedBorderShapeDecorator extends ShapeDecorator
{
    public RedBorderShapeDecorator(Shape shape) {
        super(shape);
    }

    public void setBorder() { System.out.println("[[[Red Border Added]]]"); }

    @Override
    public void draw()
    {
        setBorder();
        shape.draw();
    }


}
