package DesignPatterns.IteratorPattern;

public class LangIterator implements Iterator
{
    private String langs[];
    private int index;

    public LangIterator(String[] langs) {
        this.langs = langs;
    }

    @Override
    public Object next()
    {
        if(this.hasNext()){ return langs[index++]; }
        return null;
    }

    @Override
    public Boolean hasNext()
    {
        if(index<langs.length){ return true;}
        return false;
    }

}
