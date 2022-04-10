package DesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder
{
    String name;
    int pos;
    List<Folder> folders;

    public Folder(String name, int pos)
    {
        this.name = name;
        this.pos = pos;
        folders = new ArrayList<>();
    }

    public void addFolder(Folder folder)
    {
        folders.add(folder);
    }

    public void removeFolder(Folder folder)
    {
        folders.remove(folder);
    }

    public void displayFolders()
    {
        for (Folder folder : folders)
        {
            System.out.println("#Folder \""+name+"\" ==>  ID: "+folder.pos+", Name: "+folder.name);
        }
    }
}
