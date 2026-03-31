package unit_3_java_string;

public class PasswordMaskingSystem {

    public String maskPassword(String password) {
        int len = password.length();
        if (len <= 2) return password;
        return "*".repeat(len - 2) + password.substring(len - 2);
    }

    public static void main(String[] args) {
        PasswordMaskingSystem app = new PasswordMaskingSystem();
        System.out.println(app.maskPassword("mypassword"));
    }
}
