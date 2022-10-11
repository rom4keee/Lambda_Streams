import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {
    public List<String> collectWordsStartingWith (String text, String character) {
        List<String> collectedWords = Arrays.asList(text.split(" "));
        return collectedWords
                .stream()
                .filter(word -> word.matches("(?i)" + character + ".*"))
                .collect(Collectors.toList());
    }
}