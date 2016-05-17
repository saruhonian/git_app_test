package ua.od.hillel.home_work8;
/* 2. i18n используется для обозначения слова internationalization, где 18
означает количество букв между первой и последней в этом слове, такое можно
встретить в среде разработчиков. Например, для слова localization используется
сокращение l10n.

Напишите функцию, которая преобразует слова введенные из консоли через пробел в
сокращенную форму. Слова длиной меньше 4х оставить без изменений.
*/

import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str_line = scanner.nextLine();
        scanner.close();

        String str[] = str_line.split(" ");

        for (int n = 0; n <= str.length; n++) {


            int lastNum = str[n].length() - 1;


            char last = str[n].charAt(lastNum);


            char first = str[n].charAt(0);

            String rezult = (String.valueOf(first) + (str[n].length() - 2) + String.valueOf(last));

            System.out.println(rezult);


        }

    }
}

