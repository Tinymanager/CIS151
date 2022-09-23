package Unit_2;
import javax.swing.JOptionPane;
public class JavaLibsPractice {

    public static void main(String[] args) {

    // Start by declaring all variables
    // variables will be name; age; dwelling; distance; food; animal; bodyPart; condition; drink; duration
    //see name and age done for you below, notice integer is a bit different, again we will talk about this later in the semester
	// age and duration will require this extra set

    

    String name = JOptionPane.showInputDialog("Enter your name");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    String dwelling = JOptionPane.showInputDialog("Enter a type of dwelling");
    int distance = Integer.parseInt(JOptionPane.showInputDialog("Enter a decimal between 0 and 10"));
    String food = JOptionPane.showInputDialog("Enter a type of food");
    String animal = JOptionPane.showInputDialog("What is your favorite animal?");
    String bodypart = JOptionPane.showInputDialog( "Enter a body part");
    String condition =  JOptionPane.showInputDialog( "Enter a medical condition");
    String drink = JOptionPane.showInputDialog( "Enter a type of drink");
    int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 2 and 14"));


//once you have completed all these variables you need a message to add all the inputs together
//this is the start of the message below, the green underlined words are where you will add in the correct variable call
//the blue words are the correctly called variable
//this isn’t a perfect copy paste, you will need to play with your output to make it look right
//this is a word file copy and paste isn’t going to work as well as a text file, be ready for some debugging and problem solving!


JOptionPane.showMessageDialog(null,"hello! "+ name +" is "+ age +" years old and lives in a " + dwelling + ".\n"

        + "Next year " + name + " will be " + (age + 1) + " years old."

        + " The nearest store is " + distance + " miles from home, \n"

        + "so it is a return trip of " + (distance * 2) + " miles to buy " + food + ".\n"

        + name + " has a " + animal + " for company on the journey.\n"

        + "One day, " + name + " developed a " + condition + " on the " + bodypart + ".\n"

        + "The doctor presecribed " + drink + " every day for " + duration + " days!");    
    }   
}

