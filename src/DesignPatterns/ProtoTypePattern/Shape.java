package DesignPatterns.ProtoTypePattern;

public abstract class Shape implements Cloneable
{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){ return type; }

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    public Object clone()
    {
        try { return super.clone(); }
        catch (CloneNotSupportedException e){}
        return null;
    }
}
