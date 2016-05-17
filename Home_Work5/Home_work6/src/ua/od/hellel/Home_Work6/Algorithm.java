package ua.od.hellel.Home_Work6;


public class Algorithm {
    public static void main(String[] args) {
        int n = 9;
        int result;

        //result = n * (n + 1) * (n + 2) / 6;
        result = n^3 + 3 * n^2 + 2 * n/6;


/*
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        } */
        System.out.println("The result is " + result);
    }
}
