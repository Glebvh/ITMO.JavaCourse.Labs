package JavaLab5;

public class Lab5Main {
    public static void main(String[] args) {

        String text = "Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.";
        String text2 = "слова";
        String palText = "Я иду с мечем судия";
        String notPalText = "в строке нет знаков препинания";
        String byakaText = "Бяка на бяке и бякой погоняет";
        String badWord = "бяк";

        //5.1 Написать метод для поиска самого длинного слова в тексте.
//        maxLength(text);

        //5.2 Написать метод, который проверяет является ли слово палиндромом.
//        palindrom(palText);

        //5.3 Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
        censor(byakaText, badWord);

        //5.4 Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
//        equal(text, text2);

        //5.5 Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
        //The given string is: This is a test string
        //The string reversed word by word is: sihT si a tset gnirts
//        invert(text);
    }

    public static void maxLength(String text) {
        String text1 = text.replaceAll("\\p{P}", "");
        System.out.println(text1);
        String[] words = text1.split(" ");
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == max) {
                System.out.println("Самое длинное слово: '" + words[i] + "'");
                break;
            }
        }
    }

    // 2.Написать метод, который проверяет является ли слово палиндромом.
    public static void palindrom(String text) {

        text = text.replace(" ", "");
        StringBuilder builder = new StringBuilder(text);
        StringBuilder result = builder.reverse();

        System.out.println(text);
        System.out.println(result);

        if (text.equalsIgnoreCase(String.valueOf(result))) {
            System.out.println("It is a palindrom");
        } else {
            System.out.println("It isn't a palindrom");
        }
    }

    public static void censor(String text, String badWord) {

        String[] censor = text.split(" ");
        String result = "";
        for (int i = 0; i < censor.length; i++) {
            if (censor[i].toLowerCase().contains(badWord.toLowerCase())) {
                censor[i] = censor[i].toLowerCase().replace(badWord, "[вырезано цензурой]");
            }
            result = (result + " " + censor[i]).trim();
            // цикл я сделал для того чтобы не приводить весь текст к нижнему регистру,
            // если вдруг нужное слово в нем будет иметь заглавные буквы.
        }
        System.out.println(result);
    }

    public static void equal(String text, String text2) {
        System.out.println("Исходный текст: " + text);
        System.out.println("Искомая часть: " + text2);
        int count = 0;
        if (text.contains(text2)) {
            count = ((text.length() - text.replace(text2, "").length()) / text2.length());
        }

        System.out.println("Количество вхождений искомой части: " + count);
    }

    public static void invert(String text) {
        System.out.println("The given string is: " + text);
        String[] textArray = text.split(" ");
        String newText = "";
        for (String word : textArray) {
            char[] array = word.toCharArray();
            String wordRev = "";
            for (int i = array.length - 1; i >= 0; i--) {
                wordRev = wordRev + array[i];
            }
            newText = newText + " " + wordRev;
        }
        System.out.println("The string reversed word by word is:" + newText);
    }

}
