package unit_3_java_string;

import java.util.StringTokenizer;

public class WordCounter {

    public int countWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        return tokenizer.countTokens();
    }

    public static void main(String[] args) {
        WordCounter app = new WordCounter();
        System.out.println(app.countWords("Java is powerful language"));
    }
}
