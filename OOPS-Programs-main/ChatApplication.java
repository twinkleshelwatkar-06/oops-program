class ChatApplication {

    void sendMessage() {
        System.out.println("Sending message...");
    }

    void receiveMessage() {
        System.out.println("Receiving message...");
    }

    public static void main(String[] args) {
        ChatApplication obj = new ChatApplication();

        Thread sender = new Thread(() -> obj.sendMessage());
        Thread receiver = new Thread(() -> obj.receiveMessage());

        sender.start();
        receiver.start();
    }
}