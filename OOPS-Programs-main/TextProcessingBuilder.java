public class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" Java");

        // Display modified string
        System.out.println("Modified String: " + sb);

        // Comparison comment
        // StringBuilder is faster and not thread-safe
        // StringBuffer is thread-safe but slower
    }
}