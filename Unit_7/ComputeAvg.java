package Unit_7;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        int [] scores = new int[5];
        int sum = 0;

        Scanner console = new Scanner(System.in);

        int t = 1;
	//int test is just here so that you can tell the user which input they are on (do not get confused with index


        for (int index: scores) {
            
            System.out.println(" Enter the score " + (t++));
            int score = console.nextInt();
            scores[index] = score;
            sum += score;

        }

        double average = (double)sum / scores.length;
        System.out.println("Average test score for is : " + average);
        
    }

}
