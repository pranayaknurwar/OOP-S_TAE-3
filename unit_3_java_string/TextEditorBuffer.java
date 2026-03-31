package unit_3_java_string;

public class TextEditorBuffer {

    public String processText() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        TextEditorBuffer app = new TextEditorBuffer();
        System.out.println(app.processText());
    }
}
