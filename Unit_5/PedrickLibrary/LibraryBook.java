package Unit_5.PedrickLibrary;

public class LibraryBook {
    public String title;
    public String author;
    public int CheckoutTimeAllotment;

    public void checkTime(int p) {
        if (p >=1 && p <=50){
            CheckoutTimeAllotment = 2;
        } else if (p >=51 && p <=100){
            CheckoutTimeAllotment = 3;
        } else if (p >=101 && p <=155){
            CheckoutTimeAllotment = 4;
        } else if (p >=156 && p <=200){
            CheckoutTimeAllotment = 5;
        } else if (p >=201){
            CheckoutTimeAllotment = 6;
        }
        System.out.println("You have selected " + title + " by " + author);
        System.out.println("The numbder of pages in this text is " + p);
        System.out.println("You have " + CheckoutTimeAllotment + " weeks before you must return the text");
    }

}