package DesignPatternAug2023.Structural.Flyweight;

public class DesignExecutor {


    public static void main(String[] args) {


        WordProcessor wordProcessor = new WordProcessor();

        String str = "Hello awwww ttkkkk";
        int length = str.length();

        LetterFactory letterFactory = new LetterFactory();

        for (int i = 0; i < length; i++) {

            String value = str.substring(i, i + 1);
            wordProcessor.addLetter(letterFactory.createLetter(value));
        }

        wordProcessor.printLetters();
    }
}
