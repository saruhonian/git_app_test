package temp;

public class MainTemp {

    public static String sort(int[] array) {
        String sortSt = "null";
        String temp;
        for (int i = 0; i < array.length; i++) {
            temp = String.valueOf(array[i]);
            sortSt += temp;
        }
        return sortSt;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 6, 8};
        String gs = sort(array);
        System.out.println(gs);
    }
}

