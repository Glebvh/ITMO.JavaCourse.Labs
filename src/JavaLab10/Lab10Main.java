package JavaLab10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

public class Lab10Main {
    public static void main(String[] args) {

        File file1 = new File("files/text.txt");
        File file2 = new File("files/text write.txt");
        File file3 = new File("files/join text.txt");
        File file4 = new File("files/replace symbols.txt");

        // 1.Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

        readTextFile(file1);

        // 2.Написать метод, который записывает в файл строку, переданную параметром.

//        writeTextFile("Добавленный текст");

        // 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.

//        joinTextFiles1(file1, file2, file3);

        // 4. Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’

//        replaceSymbols(file1, file4);

    }

    public static void readTextFile(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> stringList = new ArrayList<>();
            String input;
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
                System.out.println(stringList);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeTextFile(String string, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void joinTextFiles1(File file1, File file2, File file3) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));) {
            String input;
            String input2;
            while ((input = reader.readLine()) != null && (input2 = reader2.readLine()) != null) {
                String join = input + " +++ " + input2;
                writeTextFile(join, file3);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void replaceSymbols(File file1, File file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                input = input.replaceAll("[\\p{Punct}\\p{Blank}]", "\\$");
                writeTextFile(input, file2);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
