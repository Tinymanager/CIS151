package Unit_3.Unit_3b;

import java.util.Scanner;

public class ColorRange_Soln {

    public static void main(String args[]) {
        String color;
        System.out.print("Enter a color code\n");
        Scanner keyboard = new Scanner(System.in);
        double wlength = keyboard.nextDouble();

        if (wlength >= 380 && wlength < 450){
            System.out.println("The color is Violet");
        } else if (wlength >= 450 && wlength < 495){
            System.out.println("The color is Blue");
        } else if (wlength >= 495 && wlength < 570){
            System.out.println("The color is Green");
        } else if (wlength >= 570 && wlength < 590){
            System.out.println("The color is Yellow");
        } else if (wlength >= 590 && wlength < 620){
            System.out.println("The color is Orange");
        } else if (wlength >= 620 && wlength < 750){
            System.out.println("The color is Red");
        } else if (wlength < 380 || wlength > 750){
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        
    }
}
