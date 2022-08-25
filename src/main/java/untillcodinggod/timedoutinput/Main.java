package untillcodinggod.timedoutinput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        App app = new App();

        List<String> words = new ArrayList<>();

        words.add("alpha");
        words.add("bravo");
        words.add("charlie");

        RandomWord randomWord = new RandomWord(words);

        app.run();


        boolean getWord = true;

        while (getWord) {
            randomWord.generateRandomWord();
            app.setWord(randomWord.getRandomWord());
            try {
                Thread.sleep(5 * 1000);
                String input = app.getUserInput();

                if (input.equals(randomWord.getRandomWord())) {
                    System.out.println("correct word");
                } else if (input.equals("exit")) {
                    System.exit(0);

                } else {
                    System.out.println("wrong word");
                }

            } catch (InterruptedException e) {
                // do nothing
            }
        }
    }
}