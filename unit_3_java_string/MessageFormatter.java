package unit_3_java_string;

public class MessageFormatter {

    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        MessageFormatter app = new MessageFormatter();
        System.out.println(app.getFullName("Pranay", "Aknurwar"));
    }
}
