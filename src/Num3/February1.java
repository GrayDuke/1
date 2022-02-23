package Num3;
//Регулярные выражения часть 1
public class February1 {
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
        String a = "af342dsf54345";
        System.out.println(a.matches("[a-zA-Z1-9]+\\d+"));

        String e = "hcello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.ru";
        System.out.println(url.matches("http://www\\.[a-z]+\\.(com|ru)"));

    }
}
