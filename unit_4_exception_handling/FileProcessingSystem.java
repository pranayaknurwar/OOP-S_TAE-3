package unit_4_exception_handling;

public class FileProcessingSystem {

    public void processFile() {
        try {
            System.out.println("Reading file...");
        } finally {
            System.out.println("Closing file resources");
        }
    }

    public static void main(String[] args) {
        FileProcessingSystem app = new FileProcessingSystem();
        app.processFile();
    }
}
