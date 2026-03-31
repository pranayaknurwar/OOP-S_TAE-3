package unit_3_java_string;

public class StudentNameComparison {

    public String compareNames(String name1, String name2) {
        String result = "";

        result += name1.equals(name2) 
                ? "Case-sensitive: Equal\n" 
                : "Case-sensitive: Not Equal\n";

        result += name1.equalsIgnoreCase(name2) 
                ? "Case-insensitive: Equal" 
                : "Case-insensitive: Not Equal";

        return result;
    }

    public static void main(String[] args) {
        StudentNameComparison app = new StudentNameComparison();
        System.out.println(app.compareNames("Pranay", "pranay"));
    }
}
