package labs.lab10.prob4;

import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        CountWords wc = new CountWords();
        int result = wc.countWords(Folks.friends, 'a', 'n', 4);
        System.out.println("Number of words meeting criteria: " + result);
    }

    public int countWords(List<String> words, char c, char d, int len) {
        //count how many words: have length equal to len, contain character c, do not contain character d
        return Math.toIntExact(words.stream()
                .filter(s -> s.length() == len)
                .filter(s -> s.indexOf(c) >= 0)
                .filter(s -> s.indexOf(d) < 0)
                .count()
        );
    }
}
