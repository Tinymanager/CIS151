package Unit_4.PedrickUnit4a;

import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
    Scanner console = new Scanner(System.in);
	int number = console.nextInt();
    while (number < 0){
        System.out.print("Invalid Number, try again");
        number=console.nextInt();
    }
    System.out.print("The square root of " + number + " is " + Math.sqrt(number));
   
    }
    
}
