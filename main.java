import UserLogin.UserLogin;
import PortFolio.PortFolio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
