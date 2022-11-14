package Unit_6.PedrickconcertSeries;

public class concertTest {
    public static void main(String[]args){
        PedrickConcert nashville = new PedrickConcert("Nashville", "0506", 200000);
        PedrickConcert atlanta = new PedrickConcert("Atlanta", "0428", 300000);
        PedrickConcert different = new PedrickConcert("Rhett", "Country", "Tuscaloosa", "0718", 15000);

        nashville.announcement();
        atlanta.announcement();
        different.announcement();

    }
}
