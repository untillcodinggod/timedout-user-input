package untillcodinggod.timedoutinput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWord {
    private final Random randomGenerator;
    private final List<String> words;
    private String randomWord;

    public RandomWord(List<String> words) {
        this.randomGenerator = new Random();
        this.words = words;
    }

    private int getRandomIndex() {
        return randomGenerator.nextInt(words.size());
    }

    public void generateRandomWord() {
        this.randomWord = words.get(getRandomIndex());
    }

    public String getRandomWord() {
        return randomWord;
    }
}
