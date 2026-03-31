package unit_3_java_string;

public class EmailChecker {

    public String validateEmail(String email) {
        return email.contains("@gmail.com") 
                ? "Valid Gmail Address" 
                : "Invalid Email";
    }

    public static void main(String[] args) {
        EmailChecker app = new EmailChecker();
        System.out.println(app.validateEmail("test@gmail.com"));
    }
}
