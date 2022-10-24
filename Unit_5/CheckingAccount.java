package Unit_5;

public class CheckingAccount {
    public double balance;
    public String name;

    public void withdraw(double x) {
        if (x > balance){
            System.out.println("Insufficient Funds");
        } else if (x < 0){
            System.out.println("Cannot withdraw a negative amount");
        } else {
            balance -= x;
            System.out.println("The new balance is: " + balance);
        }
    }
}
