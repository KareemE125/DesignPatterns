package DesignPatterns.IteratorPattern;

public class LangSet implements Container
{
    public String langs[] = {"Arabic","English","Dutch"};
    private LangIterator iterator;

    @Override
    public Iterator getIterator()
    {
        iterator = new LangIterator(langs);
        return iterator;
    }
}
