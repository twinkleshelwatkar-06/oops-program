public class BankApplication {

    static void processTransaction() throws Exception {
        // change to false to test exception
        boolean success = true;

        if (!success) {
            throw new Exception("Transaction failed");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}