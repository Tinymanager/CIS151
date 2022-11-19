package Unit_6.PedrickconcertSeries;

import java.util.Scanner;

public class concertTest {
	public static void main(String[] args) {
		
    PedrickConcert summerTrip = new PedrickConcert("Swift", "Nashville", 100);
    PedrickConcert summerTrip2 = new PedrickConcert("Rhett", "Atlanta", 50);
    PedrickConcert summerTrip3 = new PedrickConcert("Brown", "Cleveland", 20);
	//Example Concert summerTrip = new Concert("Swift","Nashville",100);
		
		
	//Output statements to get user input have been provided below:
    System.out.println("What artist do you want to see:?");
    Scanner keyboard = new Scanner(System.in);
    String artist = keyboard.nextLine();
    System.out.println("Which venue are you interested in?");
    String location = keyboard.nextLine();
    //I am giving you the integer.parseInt method.  This method is used when you have a string that is a number format it converts it to a int
    System.out.println("How many tickets do you need?");
    int numTickets = Integer.parseInt(keyboard.nextLine());
    //declare a Boolean variable that will hold the return value of the ticketsAvailable() method
    Boolean ticketcheck;
	//giving you the .equal method again, we used last week in PrisonersDilemma project
    
    if(artist.equals(summerTrip.artist) && location.equals(summerTrip.location)) {
    	//use the Boolean variable to run the TicketsAvailable and hold the return value
        ticketcheck = summerTrip.ticketsAvailable(numTickets);
    } else if (artist.equals(summerTrip2.artist) && location.equals(summerTrip2.location)) {
        ticketcheck = summerTrip2.ticketsAvailable(numTickets);
    } else if (artist.equals(summerTrip3.artist) && location.equals(summerTrip3.location)) {
        ticketcheck = summerTrip3.ticketsAvailable(numTickets);
    }
        
	//one more if/else that will run if Boolean variable created above is true.  Outprint statement have been provided below:
    if (ticketcheck = true){
        System.out.println(numTickets+ " tickets are available for " + summerTrip.artist+ " at " + summerTrip.location+ ".");
    } else {
        System.out.println("No tickets available are available for " + summerTrip.artist+ " at " + summerTrip.location+ ".");
    }

}
        

}