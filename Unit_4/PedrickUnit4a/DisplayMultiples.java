package Unit_4.PedrickUnit4a;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        int yes_no = 1;
        while (yes_no == 1){
            System.out.print("Enter a number: ");
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();
    
            for (int i = 1; i <=12; i++){
                System.out.println(number + "x" + i + " = " + number * i);
            }
            System.out.println("Would you like to enter a new number? 1 for yes, 2 for no");
            yes_no = console.nextInt();
        }

    }

}
