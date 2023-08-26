package DesignPatternAug2023.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {


    Map<String, Letter> map = new HashMap<>();

    public Letter createLetter(String key) {
        Letter letter = map.get(key);

        if (letter == null) {
            letter = new Letter(key);
            map.put(key, letter);
        }

        return map.get(key);
    }
}
