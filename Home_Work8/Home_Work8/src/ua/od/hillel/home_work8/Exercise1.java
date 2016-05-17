package ua.od.hillel.home_work8;

/*1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
@ заменяется на [ at ]
        . заменяется на [ dot ] */
public class Exercise1 {
    public static void main(String[] args) {
        String mail = "saruhonianartem@gmail.com";
        String rez = mail.replace("@", "[at]");
        rez = rez.replace(".", "[dot]");
        System.out.println(rez);

    }
}
