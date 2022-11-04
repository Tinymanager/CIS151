package Unit_5.PedrickPrisonerDilemma;
import java.util.Scanner;

public class PrisonersDilemma {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of Prisoner A:");
        String prisonerA = scanner.nextLine();
	
	//Get prisoner B's name
        
        System.out.println("Enter the name of Prisoner B:");
        String prisonerB = scanner.nextLine();

        String choiceA = "";
        while (!choiceA.equals("T") && !choiceA.equals("S")) {
            System.out.println("Does " + prisonerA + " choose to stay silent or testify? (S/T):");
            choiceA = scanner.nextLine();
        }

        String choiceB = "";
        while (!choiceB.equals("T") && !choiceB.equals("S")) {
            System.out.println("Does " + prisonerB + " choose to stay silent or testify? (S/T):");
            choiceB = scanner.nextLine();
        }
        
     	//now do choiceB which is what Prisoner B chooses
        int sentenceA;
        int sentenceB;
	//declare sentenceA and sentenceB
	//proceed through if/else for sentence options

        if (choiceA.equals("S") && choiceB.equals("S")) {
        sentenceA = 1;
        sentenceB = 1;
        System.out.println("Sentence of " + prisonerA + ": " + sentenceA + " years");
        System.out.println("Sentence of " + prisonerB + ": " + sentenceB + " years");

    } else if (choiceA.equals("S") && choiceB.equals("T")){
        sentenceA = 3;
        sentenceB = 0;
        System.out.println("Sentence of " + prisonerA + ": " + sentenceA + " years");
        System.out.println("Sentence of " + prisonerB + ": " + sentenceB + " years");
    } else if (choiceA.equals("T") && choiceB.equals("S")){
        sentenceA = 0;
        sentenceB = 3;
        System.out.println("Sentence of " + prisonerA + ": " + sentenceA + " years");
        System.out.println("Sentence of " + prisonerB + ": " + sentenceB + " years");
    } else if (choiceA.equals("T") && choiceB.equals("T")){
        sentenceA = 2;
        sentenceB = 2;
        System.out.println("Sentence of " + prisonerA + ": " + sentenceA + " years");
        System.out.println("Sentence of " + prisonerB + ": " + sentenceB + " years");
    }
}}
