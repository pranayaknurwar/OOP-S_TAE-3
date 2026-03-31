package unit_3_java_string;

public class FileExtensionExtractor {

    public String extractExtension(String fileName) {
        int index = fileName.lastIndexOf(".");
        return fileName.substring(index + 1);
    }

    public static void main(String[] args) {
        FileExtensionExtractor app = new FileExtensionExtractor();
        System.out.println(app.extractExtension("report.pdf"));
    }
}
