package CodingSimplifiedSep2023.String.Problem20;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEveryWordInString {


    public static void main(String[] args) {


        String str = "India is going to play pakistan in world cup on 14 October . India will try its best to beat pakistan";


        String[] splittedWords = str.toLowerCase().split("\\s+");


        Map<String, Long> wordFrequencyMap = Arrays.stream(splittedWords).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        wordFrequencyMap.forEach((key, value) -> {

            System.out.println("Word : " + key + " Frequency : " + value);
        });
    }


}




