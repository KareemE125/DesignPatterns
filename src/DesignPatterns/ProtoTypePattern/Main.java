package DesignPatterns.ProtoTypePattern;

public class Main
{
    public static void main(String[] args)
    {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        clonedShape.draw();

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        clonedShape2.draw();

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        clonedShape3.draw();

    }
}
