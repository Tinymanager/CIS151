package Unit_6.PedrickconcertSeries;

public class PedrickConcert {
    //Fiels
    public String artist;
    public String genre;
    public String location;
    public String date;
    public String venue;
    public double capacity;

    //Constructor
    public PedrickConcert(String location, String date, double capacity){
        this("Swift", "Pop Country", location, date, capacity);
    }
    public PedrickConcert(String artist, String genre, String location, String date, double capacity){
        this.artist = artist;
        this.genre = genre;
        this.location = location;
        this.date = date;
        this.capacity = capacity;
    }
    

    //Methods
    public void announcement(){
        System.out.println(artist + " " + genre + " is coming to " + location + " on " + date);
    }

}
