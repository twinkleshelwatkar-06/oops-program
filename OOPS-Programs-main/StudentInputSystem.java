import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            // Force ArithmeticException example (optional logic)
            int check = 10 / 1;  // change to 10/0 to test ArithmeticException

            System.out.println("Student age is: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }
    }
}