package Unit_2;
public class pedrickShoppingCart {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Alex";
        String itemDesc = "Shirt";
        String message = "";

        message = custName + " wants to purchase a " + itemDesc;
        System.out.println(message);

        double price = 25.00;
        double tax = 0.08;
        int quantity = 2;
        double totalPrice = price * quantity + tax * price * quantity;
        message = custName + " wants to purchase " +  quantity + " " + itemDesc;
        System.out.println(message);

        System.out.println("Total cost with tax is: $" + totalPrice);
        
        // Assign the message variable 
        
        
        // Print and run the code
        
    }
}