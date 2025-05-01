import UserLogin.UserLogin;
import PortFolio.PortFolio;
import Orders.Order;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {


        Order myOrder = new Order(1,1,"apple");
        myOrder.addOrder(1,1,"tesla"); 
        myOrder.addOrder(1,1,"ford");

        myOrder.printOrders();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();
        sc.close();

        PortFolio myfolio = new PortFolio();
        
        
        if(UserLogin.login(enteredUsername, enteredPassword)){
            System.out.println("Login Sucessfull");
        }
    }
}
