package ua.od.hillel.home_work8;


public class Exercise4 {
    public static void main(String[] args) {
        String Number = "1101";
        int intNumber = Integer.parseInt(Number);
        String rezNumber = String.format("(Двоичное значение): %o\n", intNumber);
        System.out.println(rezNumber);
    }
}
