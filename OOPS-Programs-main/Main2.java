class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main2{
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum = " + c.add(5, 6));
        System.out.println("Sum = " + c.add(2, 3, 4));
        System.out.println("Sum = " + c.add(2.5, 3.5));
    }
}