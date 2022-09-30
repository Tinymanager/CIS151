package Unit_3.PedrickUnit3a;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is even: " + num);
        } else {
            System.out.println("The number is odd: " + num);
        }
	    //first if statement
		//hint make a condition where if the number is divisible by 2 with no remainder it is even
		// % symbol is called modulo it basically judges if there is a remainder after division
		// num % 2 == 0

        
    }
}