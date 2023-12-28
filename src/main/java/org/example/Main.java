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

    static String removeHtmlTags(String text){
        return text.replaceAll("\\<.*?\\>", "");
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

        // завдання 3.
        String htmlText = "<div>\n<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\nдозволяють отримати з рядка додаткову інформацію.\n<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\nза заданим виразом і знаходить її - він просто повертає\nзнайдений рядок.</p>\n<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n</div>";
        String plainText = removeHtmlTags(htmlText);
        System.out.println("Текст після видалення HTML тегів:" + plainText);
    }
}