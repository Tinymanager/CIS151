package Unit_6.PedrickconcertSeries;

public class PedrickConcert {
    //Fiels
    public String artist;
    public String genre;
    public String location;
    public String date;
    public double capacity;

    //Constructor
    

    //Methods
    public void announcement(){
        System.out.println(artist + " is coming to " + location + " on " + date);
    }

    public void setFields(String a, String g, String l, String d, double c) {
        artist = a;
        genre = g;
        location = l;
        date = d;
        capacity = c;
    }
}
