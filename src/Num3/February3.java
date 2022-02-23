package Num3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Классы Pattern and Matcher
public class February3 {
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
    String text = "Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности влечет\n" +
            " за собой процесс внедрения и модернизации дальнейших направлений развития.\n" +
            " Повседневная практика показывает, что постоянный seryu@mail.com количественный рост и сфера нашей активности в\n" +
            " значительной степени обуславливает создание соответствующий условий активизации. \n" +
            "Равным образом dsdff@nett.ru постоянное информационно-пропагандистское обеспечение нашей деятельности \n" +
            "влечет за собой процесс внедрения pavel@gmail.com и модернизации новых предложений. Идейные соображения \n" +
            "высшего порядка, а также постоянный количественный рост и сфера нашей активности требуют\n" +
            " определения и уточнения дальнейших направлений развития.\n" +
            "\n";
        //System.out.println(text);
        Pattern email = Pattern.compile("(\\w+)@\\w+\\.(com|ru)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()){
            System.out.println("@" + matcher.group(1)+"."+matcher.group(2));
        }
    }
}
