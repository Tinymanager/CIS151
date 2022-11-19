package Unit_6.PedrickconcertSeries;

public class PedrickConcert {
    //Fiels
    public String artist;
    public String location;
    public int totalTickets;

    //Constructor
    public PedrickConcert(String artist, String location, int totalTickets){
        this.artist = artist;
        this.location = location;
        this.totalTickets = totalTickets;
    }
    

    //Methods
    public boolean ticketsAvailable(int num) {
        if (num <= totalTickets){
            return true;
        }
        else if (num > totalTickets){
            return false;
        } else {return false;}
    }

}
