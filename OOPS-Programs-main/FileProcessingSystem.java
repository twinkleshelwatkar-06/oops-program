public class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");
            // Simulating file reading
        } catch (Exception e) {
            System.out.println("Error reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}