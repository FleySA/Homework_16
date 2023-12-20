package com.proftelran.org.homework_16;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Пароль введен корректно.");
        } else {
            System.out.println("Пароль введен некорректно.");
        }
    }

    private static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d!@#$%^&*()-_=+;:,.<>/?`~\\[\\]{}|\"']{8,}$"; // Это регулярное выражение проверяет, что пароль содержит как минимум одну букву, одну цифру и имеет длину не менее 8 символов.
                                                                                                               // В дополнение к этому, разрешены некоторые специальные символы.
        return Pattern.matches(passwordRegex, password);
    }
}