import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Dictionary dictionary = new Dictionary();

        DictionaryCommandline.showAllWords(dictionary);

        Word word = new Word("new", "mới");
        dictionary.addWord(word);

        DictionaryCommandline.showAllWords(dictionary);

        DictionaryCommandline.dictionaryBasic(dictionary);
    }
}