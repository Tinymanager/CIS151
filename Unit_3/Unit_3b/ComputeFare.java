package Unit_3.Unit_3b;

import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        //Get scanner info...reference MovieWatch program
        int age = keyboard.nextInt();
        int fare = 0;
        
        if (age <= 11){
            fare = 2;
        } else if (age >= 12  && age <= 65){
            fare = 5;
        } else if (age > 65){
            fare = 3;
        }

        System.out.println("Your fare is $" + fare);
	//create a complex if/else conditional statement:
		// If person is under 11 fare is $2
		// If person is over 11 but under 65 fare is $5
		// If person is Over 65 fare is $3
    }
}