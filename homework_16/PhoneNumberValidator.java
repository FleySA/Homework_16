package com.proftelran.org.homework_16;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите телефонный номер: ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Телефонный номер введен корректно.");
        } else {
            System.out.println("Телефонный номер введен некорректно.");
        }
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "\\d{7}|\\d{3}[-\\s]\\d{4}|\\d{3} \\d{4}"; // Это регулярное выражение соответствует трем форматам телефонных номеров: "7777777", "777-7777", "777 7777".
        return Pattern.matches(phoneNumberRegex, phoneNumber);
    }
}