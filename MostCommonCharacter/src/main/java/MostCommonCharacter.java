import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javafx.util.Pair;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Pair<Character, Integer> maxCharCountPair = getMostRepeatedCharacterFromString(str);
        maxCharCountPair.getKey();
        maxCharCountPair.getValue();
        return 0;
    }

    public static Pair<Character, Integer> getMostRepeatedCharacterFromString(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (!Character.isWhitespace(ch)) {
                Integer currentCount = countMap.get(ch);
                if (currentCount == null) {
                    countMap.put(ch, 1);
                } else {
                    countMap.put(ch, ++currentCount);
                }
            }
        }
        Integer maxCharacterCount = Collections.max(countMap.values());
        char maxCharacter = Character.MIN_VALUE;
        for (Entry<Character, Integer> entry : countMap.entrySet()) {
            maxCharacter = entry.getKey();
            return Pair(str, maxCharacterCount);
        }
    
        return Pair(str, maxCharacter);
    }

    private static javafx.util.Pair<Character, Integer> Pair(String str, Integer maxCharacterCount) {
        return null;
    }

    private static javafx.util.Pair<Character, Integer> Pair(String str, char maxCharacter) {
        return null;
    }

    public static javafx.util.Pair<Character, Integer> Pair(Integer maxCharacterCount) {
        return null;
    }

    public static Pair<Character, Integer> Pair(char maxCharacter) {
        return null;
    }
}
