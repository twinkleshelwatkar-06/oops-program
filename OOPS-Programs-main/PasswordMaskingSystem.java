import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String masked = "";

        for (int i = 0; i < password.length(); i++) {
            if (i < password.length() - 2) {
                masked += "*";
            } else {
                masked += password.charAt(i);
            }
        }

        System.out.println("Masked Password: " + masked);
    }
}