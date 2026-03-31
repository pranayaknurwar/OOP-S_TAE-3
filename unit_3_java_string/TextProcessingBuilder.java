package unit_3_java_string;

public class TextProcessingBuilder {

    public String buildText() {
        return new StringBuilder("Hello").append(" Builder").toString();
    }

    public static void main(String[] args) {
        TextProcessingBuilder app = new TextProcessingBuilder();
        System.out.println(app.buildText());
    }
}
