package ua.od.hillel.Home_Work5;

/**
 * 2.  Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы,
 * но также в возрастающем порядке.
 * <p>
 * Пример ввода:
 * a = {1, 3, 5}
 * b = {2, 4, 8, 9, 12}
 * Результат:
 * c = {1, 2, 3, 4, 5, 8, 9, 12}
 */
public class Exercise_2 {
    public static void main(String[] args) {
        int[] array_a = {1, 3, 5};
        int[] array_b = {2, 4, 8, 9, 12};
        int[] array_c = new int[array_a.length + array_b.length];


        for (int n = 0; n < array_b.length; n++) {
            if (array_b[n] != 0) {
                array_c[n] = array_b[n];
                n++;
            } else {
                for (int d = 0; d < array_a.length; d++) {
                    if (array_a[d] != 0) {
                        array_c[5 + d] = array_a[d];
                        d++;
                    }
                }
            }

        }

        System.out.println(array_c);
        return;
    }

}
