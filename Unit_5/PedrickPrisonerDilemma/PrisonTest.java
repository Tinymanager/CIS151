package Unit_5.PedrickPrisonerDilemma;

public class PrisonTest {

    public static void main(String[] args) {
        Prisoner bob = new Prisoner();
        bob.name = "Bob";
        bob.height = 2.08;
        bob.sentence = 4;
        Prisoner sally = new Prisoner();
        sally.name = "Sally";
        sally.height = 1.73;
        sally.sentence = 3;

        System.out.println(bob == sally);
        sally.name = "Bob";
        sally.height = 2.08;
        sally.sentence = 4;
        System.out.println(bob == sally);
        System.out.println(bob);
        System.out.println(sally);
    } 
}