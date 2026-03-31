package unit_3_java_string;

public class UsernameValidator {

    public String cleanUsername(String username) {
        return username.trim().toLowerCase();
    }

    public static void main(String[] args) {
        UsernameValidator app = new UsernameValidator();
        System.out.println(app.cleanUsername("  Pranay123  "));
    }
}