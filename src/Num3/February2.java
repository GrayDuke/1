package Num3;

import java.lang.reflect.Array;
import java.util.Arrays;

// Регулярные варажения часть 2
public class February2 {
    public static void main(String[] args) {
        /*
            \\d  - одна цифра
            \\w - one english letter
            + - 1 и более
            * - 0 и более
            ? - 0 или 1 символов до
            (x|y|z)?.......

            [abc] = (a|b|c)
            [a-zA-Z] - All english letters
            [^abc] - все символы кроме a b c

           . - любой символ

           {2} - only 2 symbols
           {2,} - 2 and more symbols
           {2,4} - 2 to 4
         */

        String word = "Hello23432my43243followers";
        String[] words = word.split("\\d+");
        System.out.println(Arrays.toString(words));

        String word1 = "Hi5463my5464little5646pony";
        String nw1 = word1.replaceAll("\\d+"," ");
        System.out.println(nw1);
    }
}
