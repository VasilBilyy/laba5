package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;




public class Main {

    static boolean check_number(String number){
        return number.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
    }

    public static void main(String[] args) {


        List<String> phoneNumbers = Arrays.asList("(+380)50-333-33-33", "(+380)67-5234-225-55", "123-45-678"); // додайте номери для перевірки

        for (String phoneNumber : phoneNumbers) {
            if (check_number(phoneNumber)) {
                System.out.println("Номер телефону " + phoneNumber + " вірний");
            } else {
                System.out.println("Номер телефону " + phoneNumber + " невірний");
            }
        }

        // Приклад 2:
        String inputEmails = "john@example.com, alice@gmail.com, bob@yahoo.com";
        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher2 = pattern2.matcher(inputEmails);

        while (matcher2.find()) {
            System.out.println("Знайдено email: " + matcher2.group());
        }
    }
}