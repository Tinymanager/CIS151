package Unit_5;

public class AccountTest {
    public static void main(String args[]) {
        CheckingAccount ca0001 = new CheckingAccount();
        ca0001.balance = 1000;
        ca0001.name = "Damian";

        ca0001.withdraw(2000);
        ca0001.withdraw(-100);
        ca0001.withdraw(50);

    }
}
