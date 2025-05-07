import java.util.Scanner;
import PortFolio.PortFolio;

public class Functions {

    //All Objects
    static PortFolio myFolio = new PortFolio();

    public static void showMainMenu(Scanner sc) {
        int option = 0;

        while (option != 9) {
            System.out.println("\nMain Menu");
            System.out.println("1. Portfolio");
            System.out.println("2. Orders");
            System.out.println("3. Transactions");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");

            
            while (!sc.hasNextInt()) {
                System.out.print("\nPlease enter a valid number: ");
                sc.next();
            }

            option = sc.nextInt();

            switch (option) {
                case 1:
                    Portfolio();  
                    break;
                case 2:
                    Orders();   
                    break;
                case 3:
                    Transactions();  
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void Portfolio() {
        System.out.println("\nChoose The Following Options");

        
    }

    public static void Orders() {
        System.out.println("Handling orders...");
        // Your Queue-based order logic here
    }

    public static void Transactions() {
        System.out.println("Showing transactions...");
        // Your LinkedList-based transaction logic here
    }


    public static void main(String[] args) {
        
    }
}
    

