class Bank {

    final double interestRate = 5.5;

    void calculateInterest(double amount) {
        double interest = (amount * interestRate) / 100;
        System.out.println("Interest = " + interest);
    }

    public static void main(String[] args) {

        Bank b = new Bank();

        b.calculateInterest(10000);
        b.calculateInterest(20000);
    }
}