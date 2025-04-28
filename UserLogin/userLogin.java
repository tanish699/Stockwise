package UserLogin;
import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {

    public static boolean  login() {
        
        HashMap<String, String> userDatabase = new HashMap<>();

        
        userDatabase.put("Isha", "Ishaisha05");

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();
        sc.close();

        
        if (userDatabase.containsKey(enteredUsername)) {
            
            String correctPassword = userDatabase.get(enteredUsername);

            if (correctPassword.equals(enteredPassword)) {
                return true;
            } else {
                return false;
            }
        } else {
            
            System.out.println("Username not found. Please register.");
        }
        return false;

        
    }

    public static void main(String[] args) {
        System.out.println("Code executed without errors");
    }
    
}
