package labs.lab10.prob4;

import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        CountWords cw = new CountWords();

        int len = 4;
        System.out.printf("Words that have length equal to 4: "
                + cw.countWords(Folks.friends, 'N', 's', 4) + "%n");
    }

    public int countWords(List<String> words, char c, char d, int len) {
        // counts the number of words in the input list words that have length equal to len,
        // that contain the character c, and that do not contain the character d.
        return Math.toIntExact(words.stream()
                .filter(s -> s.length() == len)
                .filter(s -> s.indexOf(c) >= 0)
                .filter(s -> s.indexOf(d) < 0)
                .count()
        );
//        int count = 0;
//        for (String s : words) {
//            if (s.length() == len) {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) != d && s.charAt(i) == c)
//                        count++;
//                }
//            }
//        }
//        return count;

    }
}
