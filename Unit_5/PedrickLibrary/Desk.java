package Unit_5.PedrickLibrary;

public class Desk {
    public static void main(String args[]) {

        LibraryBook lb01 = new LibraryBook();
        lb01.title = "Birds";
        lb01.author = "Arthur";

        int pagecount = 180;
        lb01.checkTime(pagecount);
    }
    
}
