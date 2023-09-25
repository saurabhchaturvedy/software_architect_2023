package CodingSimplifiedSep2023.String.Problem20;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWordsAfterExcluding {


    public static List<String> mostFrequent(String str, String[] excludingItems) {

        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        String[] allWords = str.split(" +");

        Map<String, Integer> countingMap = new HashMap<>();

        for (String word : allWords) {
            word = word.toLowerCase();
            countingMap.put(word, countingMap.getOrDefault(word, 0) + 1);
        }

        for (String excluded : excludingItems) {
            if (countingMap.containsKey(excluded)) {
                countingMap.remove(excluded);
            }
        }

        TreeMap<String, Integer> mostFrequentMap = new TreeMap<>((e1, e2) -> {
            int freq1 = countingMap.get(e1);
            int freq2 = countingMap.get(e2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }

            return e1.compareTo(e2);
        });

        mostFrequentMap.putAll(countingMap);

        List<String> mostFrequentWords = new ArrayList<>();

        int topFreq = mostFrequentMap.firstEntry().getValue();

        while (!mostFrequentMap.isEmpty()) {
            Map.Entry<String, Integer> word = mostFrequentMap.pollFirstEntry();

            if (word.getValue() == topFreq) {
                mostFrequentWords.add(word.getKey());
            } else {
                break;
            }
        }

        return mostFrequentWords;
    }

    public static void main(String[] args) {
        String str = "Best items in category are Samsung lenovo. Samsung items are nice. Lenovo are cool";

        String[] excludingItems = {"in", "are"};

        System.out.println(MostFrequentWordsAfterExcluding.mostFrequent(str, excludingItems));


        String str1 = "Database";

        Map<Character, Long> charFrequencyMap = str1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charFrequencyMap.forEach((key, value) -> {

            System.out.println("Key : " + key + "  Value : " + value);
        });

        String input = "This is a test string. This string contains some words, and some words are repeated. Test string.";
        // Split the input string into words and convert them to lowercase
        String[] words = input.toLowerCase().split("\\s+");

        // Create a map of word frequency
        Map<String, Long> wordFrequencyMap = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the maximum frequency
        long maxFrequency = wordFrequencyMap.values().stream().max(Long::compare).orElse(0L);

        // Find all words with the maximum frequency
        List<String> mostFrequentWords = wordFrequencyMap.entrySet().stream().filter(entry -> entry.getValue() == maxFrequency).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(mostFrequentWords);


    }


}
