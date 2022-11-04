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

        PrisonersDilemma pd = new PrisonersDilemma();
        pd.run();

        /*System.out.println(bob == sally);
        sally.name = "Bob";
        sally.height = 2.08;
        sally.sentence = 4;
        System.out.println(bob == sally);
        System.out.println(bob);
        System.out.println(sally);

        bob = sally;
        System.out.println(bob == sally);
        System.out.println(bob);
        System.out.println(sally);

        Prisoner bob2 = new Prisoner();
        bob2.name = "bob";
        bob2.height = 2.08;
        bob2.sentence = 4;

        Prisoner sally2 = new Prisoner();
        sally2.name = "Sally";
        sally2.height = 1.73;
        sally2.sentence = 3;

        System.out.println(bob2 == sally2);

        System.out.println(sally2.name);
        sally2.name = "Dennis";
        System.out.println(sally2.name);

        String s1 = new String("Test");
        String s2 = new String("Test");
        System.out.println(s1);
        System.out.println(s2);*/

    } 
}