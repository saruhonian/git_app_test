package ua.od.hillel.home_work8;
//package ua.com.prologistic;

        import java.util.Arrays;

public class SplitStringIntoStringArray{

    public static void main(String[] args) {
        String line = "Как использовать метод split";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);
        System.out.println("Используем разделитель: " + Arrays.toString(words));
        System.out.println("Разделяем на 2 строки: " + Arrays.toString(twoWords));
        //метод split со специальным разделителем
        String wordsSpecial = "Как|использовать|метод|split";
        String[] numbers = wordsSpecial.split("\\||");
        System.out.println("метод split со специальным разделителем: " + Arrays.toString(numbers));
    }
}
