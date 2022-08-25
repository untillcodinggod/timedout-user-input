package untillcodinggod.timedoutinput;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;


public class TestRandomWord {
    private RandomWord randomWord;

    @Test
    void testRandomWordWithOnlyAlpha() {
        List<String> words = new ArrayList<>();
        words.add("alpha");

        this.randomWord = new RandomWord(words);
        randomWord.generateRandomWord();

        assertThat(Arrays.asList("alpha"), hasItem(randomWord.getRandomWord()));
    }

    @Test
    void testRandomWordWithAlphaAndBravo() {
        List<String> words = new ArrayList<>();
        words.add("alpha");
        words.add("bravo");

        this.randomWord = new RandomWord(words);
        randomWord.generateRandomWord();

        assertThat(Arrays.asList("alpha", "bravo"), hasItem(randomWord.getRandomWord()));
    }

    @Test
    void testRandomWordWithThreeWords() {
        List<String> words = new ArrayList<>();
        words.add("alpha");
        words.add("bravo");
        words.add("charlie");

        this.randomWord = new RandomWord(words);
        randomWord.generateRandomWord();

        assertThat(Arrays.asList("alpha", "bravo", "charlie"), hasItem(randomWord.getRandomWord()));
    }
}
