package lesson_12_string_regular_expressions;

import java.util.regex.Pattern;

public class MyRegularExpressions {
    public static void main(String[] args) {
        // Regular expressions
        // Проверка строчки или ее определенной части на соответствие шаблону
        // Электронный адрес: username @ gmail.com
        // Regular expression -> username (standards) + @ + domain name
        // if regex == e-mail -> ACCESS GRANTED

        // E-mail: допустимость вписанного электронного адреса (12s@.gmail.com - fails)
        // Password: _________ -> database check (MD5) - шифрование

        // Soft Check
        // Strict check

        String regex = "[+/*%-]";
        String expression = "56+1-4";
        String[] splitExpression = expression.split(regex);

        // username _ @ _ anyDomain . com
        // rt134@jk.com
        // Soft check of the e-mail: username@name(.)(com)

        // Java Pattern -> сохраняет шаблон через регулярное выражение и обрабатывает
        // На основе этого паттерна (шаблона) он просто сравнивает Matcher

        Pattern pattern = Pattern.compile("[*.]");
    }
}