package Unit_6.PedrickconcertSeries;

public class concertTest {
    public static void main(String[]args){
        PedrickConcert nashville = new PedrickConcert("Swift", "Pop Country","Nashville", "0506", 200000);

        nashville.ticketPrint();
        nashville.ticketPrint(true);

    }
}
