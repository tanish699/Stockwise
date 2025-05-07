import UserLogin.UserLogin;

import Orders.Order;
import Transactions.Transactions;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {

        System.out.println("Welcome to Stockwise");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();
        
        if(UserLogin.login(enteredUsername, enteredPassword)){
            System.out.println("Login Sucessfull");
            
            Functions.showMainMenu(sc);
            

            }
            
            sc.close();
        }
        
        
        Order myOrder = new Order(1,1,"apple");
        // myOrder.addOrder(1,1,"tesla"); 
        // myOrder.addOrder(1,1,"ford");
        
        // myOrder.printOrders();
        
        PortFolio myfolio = new PortFolio();
        
        
    }


    


