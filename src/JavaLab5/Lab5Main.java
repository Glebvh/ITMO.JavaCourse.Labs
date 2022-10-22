package JavaLab5;

public class Lab5Main {
    public static void main(String[] args) {

        String text = "Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.";
        String text2 = "слова";
        String palText = "Я иду с мечем судия";
        String notPalText = "в строке нет знаков препинания";
        String byaka = "Бяка на бяке и бякой погоняет";
        //5.1 Написать метод для поиска самого длинного слова в тексте.

//        maxLength(text);

        //5.2 Написать метод, который проверяет является ли слово палиндромом.
//        Palindrom(notPalText);

        //5.3 Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
//        Censor(byaka);

        //5.4 Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
//        Equal(text, text2);

        //5.5 Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
        //The given string is: This is a test string
        //The string reversed word by word is: sihT si a tset gnirts
        Invert(text);
    }

    public static void maxLength(String text) {
        String text1 = text.replace(",", "");
        String text2 = text1.replace(".", "");
        System.out.println(text1);
        String[] words = text2.split(" ");
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
    public static void Palindrom(String text) {
        String word = text.replace(" ", "");
        char[] array = word.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(word);
        System.out.println(result);

        if (word.equalsIgnoreCase(result)) {
            System.out.println("It is a palindrom");
        } else {
            System.out.println("It isn't a palindrom");
        }
    }

    public static void Censor(String text) {
        String[] censor = text.split(" ");
        String result = text;
        for (int i = 0; i < censor.length; i++) {
            if (censor[i].equalsIgnoreCase("бяка")
                    || censor[i].equalsIgnoreCase("бяке")
                    || censor[i].equalsIgnoreCase("бякой")
                    || censor[i].equalsIgnoreCase("бяку")) {
                result = result.replace(censor[i], "[вырезано цензурой]");
            }
        }
        System.out.println(result);
    }

    public static void Equal(String text, String text2) {
        System.out.println("Исходный текст: " + text);
        System.out.println("Искомая часть: " + text2);
        int count = 0;
        if (text.contains(text2)) {
            count = ((text.length() - text.replace(text2, "").length()) / text2.length());
        }

        System.out.println("Количество вхождений искомой части: " + count);
    }

    public static void Invert(String text) {
        System.out.println("The given string is: "+ text);
        String[] textArray = text.split(" ");
        String newText = "";
        for (String word: textArray){
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
