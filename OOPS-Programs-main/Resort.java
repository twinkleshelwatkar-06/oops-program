import java.util.Scanner;

class Resort {

    int Rno;
    String Name;
    int Charges;
    int Days;

    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000)
            amount = (float)(1.02 * amount);

        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room No: ");
        Rno = sc.nextInt();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextInt();

        System.out.print("Enter Days: ");
        Days = sc.nextInt();
    }

    void Dispinfo() {
        System.out.println("Room No: " + Rno);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.Dispinfo();
    }
}