package UserLogin;
import java.util.HashMap;

public class UserLogin {

    public static boolean login(String enteredUsername, String enteredPassword) {
        
        HashMap<String, String> userDatabase = new HashMap<>();

        
        userDatabase.put("Isha", "Ishaisha05");

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
