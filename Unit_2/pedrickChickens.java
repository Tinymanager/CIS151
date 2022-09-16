package Unit_2;
public class pedrickChickens {
    public static void main(String[] args) {
        //Put yout code here
        //The chickens lay eggs every day at noon
        //On monday the farmer has x chickens
        //On Tuesday morning the farmer gains one more chicken
        //On Wednesday morning, half the chickens are eaten
        //So how many eggs would the farmer have


        //Start of the week Ver 1
        int eggsPerChicken = 5;
        int chickenCount = 3;       
        int totalEggs = 0;

        //Monday
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        //Tuesday
        chickenCount = chickenCount + 1;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        //Wednsday
        chickenCount = chickenCount/2;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        System.out.println(totalEggs + " Eggs");

        //Start of the week Ver 2
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = 0;
        
        //Monday
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        //Tuesday
        chickenCount = chickenCount + 1;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        //Wednsday
        chickenCount = chickenCount/2;
        totalEggs = totalEggs + (chickenCount * eggsPerChicken);
        System.out.println(totalEggs + " Eggs");
    }   
}