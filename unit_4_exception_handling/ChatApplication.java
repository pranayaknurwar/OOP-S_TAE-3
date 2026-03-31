package unit_4_exception_handling;

public class ChatApplication {

    public void startChat() {

        Thread sender = new Thread(() -> {
            System.out.println("Sending messages...");
        });

        Thread receiver = new Thread(() -> {
            System.out.println("Receiving messages...");
        });

        sender.start();
        receiver.start();
    }

    public static void main(String[] args) {
        ChatApplication app = new ChatApplication();
        app.startChat();
    }
}
