package StudentGradeSystem;
import java.util.*;

public class PractObj {
    private String loginID;
    private String password;

    public static void main(String[] args) {
        PractObj obj = new PractObj();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = sc.nextLine();
        obj.setLoginID(user); // Store the entered username in the object

        System.out.println("Enter your password");
        String password = sc.nextLine();
        obj.setPassword(password); // Store the entered password in the object

        System.out.println("Login successfully"); // Corrected the typo 'succesfully' to 'successfully'
    }

    // Getter for loginID
    public String getLoginID() {
        return loginID;
    }

    // Setter for loginID
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
