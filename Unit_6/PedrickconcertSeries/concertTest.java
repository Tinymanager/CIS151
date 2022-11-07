package Unit_6.PedrickconcertSeries;

public class concertTest {
    public static void main(String[]args){
        PedrickConcert Fav = new PedrickConcert();
        PedrickConcert SecondFav = new PedrickConcert();

        Fav.setFields("Swift", "Pop Country", "Nashville", "0506", 10000);
        SecondFav.setFields("Rhett", "Country", "Tuscaloosa", "0907", 15000);
        Fav.announcement();
        SecondFav.announcement();
    }
}
