package Unit_5;

public class Bond {
    public String name;
    public double balance;
    public int term, monthsRemaining;
    public double rate;

//you will have two methods (behaviors) setTermAndRate and earnInterest
//I am giving you earnInterest you must figure out setTermAndRate using the hints provided

    public void setTermAndRate(int t){ 
        if (t >= 0 && t <= 11){
            rate = 0.005;
        } else if (t >= 12 && t <= 23){
            rate = 0.01;
        } else if (t >= 24 && t <= 35){
            rate = 0.015;
        } else if (t >= 36 && t <= 47){
            rate = 0.02;
        } else if (t >= 48 && t <= 60){
            rate = 0.025;
        } else {
            System.out.println("Invalid Term");
        }
        term = t;
        monthsRemaining = t;
//make sure you declare a variable in this parameter ()

//ifelse statements need to be created to reflect the instructions in the PPT slide

//last else statement should print out System.out.println("Invalid Term");

//once ifelse statements are complete assign variable declared in parameter of setTermandRate to be the value of the declared term variable above

//also set that declared parameter variable to monthsRemaining variable declared above
        
    }
    
    public void earnInterest(){
        if(monthsRemaining > 0){
            balance += balance*rate/12;
            monthsRemaining--;
            System.out.println("Balance: $" +balance);
            System.out.println("Rate: " +rate);
            System.out.println("Months Remainint:" +monthsRemaining);
        }
        else{
            System.out.println("CD Matured");
        }
    }
}
