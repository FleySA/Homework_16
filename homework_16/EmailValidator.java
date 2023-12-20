package com.proftelran.org.homework_16;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email введен корректно.");
        } else {
            System.out.println("Email введен некорректно.");
        }
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$"; // пример "user@example.com".
        return Pattern.matches(emailRegex, email);
    }
}