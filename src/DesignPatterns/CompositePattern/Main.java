package DesignPatterns.CompositePattern;

import DesignPatterns.Helpers;

public class Main {
    public static void main(String[] args) {
        System.out.println("==> Composite Pattern <==\n\n");

        Folder ASU = new Folder("ASU",0);

        Folder year1 = new Folder("Year 1",1);
        Folder year2 = new Folder("Year 2",1);
        Folder year3 = new Folder("Year 3",1);

        Folder math = new Folder("Math",2);
        Folder english = new Folder("English",2);
        Folder sp = new Folder("SP",2);
        Folder ds = new Folder("DS",2);
        Folder algo = new Folder("Algorithm",2);
        Folder os = new Folder("OS",2);

        ASU.addFolder(year1);   ASU.addFolder(year2);   ASU.addFolder(year3);

        year1.addFolder(math);  year1.addFolder(english);

        year2.addFolder(sp);    year2.addFolder(ds);

        year3.addFolder(algo);  year3.addFolder(os);

        ASU.displayFolders();   Helpers.printDividor();
        year1.displayFolders(); Helpers.printDividor();
        year2.displayFolders(); Helpers.printDividor();
        year3.displayFolders(); Helpers.printDividor();

        year3.removeFolder(os);
        year3.displayFolders(); Helpers.printDividor();

    }
}
