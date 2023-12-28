package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;




public class Main {

    static boolean check_number(String number){
        return number.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
    }

    static String replace_spaces(String text){
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {

        // Завдання 1.
        List<String> phoneNumbers = Arrays.asList("(+380)50-333-33-33", "(+380)67-5234-225-55", "123-45-678"); // додайте номери для перевірки

        for (String phoneNumber : phoneNumbers) {
            if (check_number(phoneNumber)) {
                System.out.println("Номер телефону " + phoneNumber + " вірний");
            } else {
                System.out.println("Номер телефону " + phoneNumber + " невірний");
            }
        }
        // Завдання 2.
        String inputString = "Я хочу    бути     програмістом";
        String resultString = replace_spaces(inputString);
        System.out.println("Рядок після заміни пробілів: " + resultString);

    }
}