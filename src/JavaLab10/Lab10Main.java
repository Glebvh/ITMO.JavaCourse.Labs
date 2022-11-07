package JavaLab10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

public class Lab10Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Добавленная строка");
        list.add("Еще одна");
        list.add("И еще");

        File file1 = new File("files/text.txt");
        File file2 = new File("files/text write.txt");
        File file3 = new File("files/join text.txt");
        File file4 = new File("files/replace symbols.txt");

        // 1.Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

//        System.out.println(readFileReturnList(file1));


        // 2.Написать метод, который записывает в файл строку, переданную параметром.

//        writeTextFile(list, file2);

        // 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.

//        joinTextFiles1(file1, file2, file3);
        joinTextFiles2(file1, file2, file3);

        // 4. Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’

//        replaceSymbols(file1, file4);

    }

    public static List<String> readFileReturnList(File file) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return stringList;
    }

    public static void writeTextFile(List<String> list, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String s : list) {
                writer.append(s + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void joinTextFiles1(File file1, File file2, File file3) {
        List<String> list1 = new ArrayList<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));) {
            String input1;
            String input2;
            while ((input1 = reader1.readLine()) != null) {
                list1.add(input1);
                writeTextFile(list1, file3);
            }
            while ((input2 = reader2.readLine()) != null) {
                list1.add(input2);
                writeTextFile(list1, file3);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void joinTextFiles2(File file1, File file2, File file3) {
        List<String> list = new ArrayList<>();
        list.addAll(readFileReturnList(file1));
        list.addAll(readFileReturnList(file2));
        writeTextFile(list, file3);
    }

    public static void replaceSymbols(File file1, File file2) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input;
            while ((input = reader.readLine()) != null) {
                input = input.replaceAll("[\\p{Punct}\\p{Blank}]", "\\$");
                list.add(input);
                writeTextFile(list, file2);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
