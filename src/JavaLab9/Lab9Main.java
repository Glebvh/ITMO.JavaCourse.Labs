package JavaLab9;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Lab9Main {
    public static void main(String[] args) {

        //////// Task 1
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(1);
        collection.add(2);
        collection.add(2);
        collection.add(3);
        collection.add(3);

        System.out.println(collection);

        Set<Integer> newCollection = deleteDoubles(collection);

        System.out.println(newCollection);

        ////////Task 2
        List<Integer> emptyArrayList = new ArrayList<>();
        List<Integer> arrayList = addToCollection(emptyArrayList);
        getTime(arrayList, "ArrayList");

        List<Integer> emptyLinkedList = new LinkedList<>();
        List<Integer> linkedList = addToCollection(emptyLinkedList);
        getTime(linkedList, "LinkedList");

        ////////Task3
        Map<String, Integer> map = new HashMap<>();
        map.put("Igor", 10);
        map.put("Ivan", 15);
        map.put("Maria", 20);

        User user = new User();
        user.getUserScore(map);
    }

    static Set<Integer> deleteDoubles(List<Integer> collection) {
        Set<Integer> editedCollection = new HashSet<>(collection);
        return editedCollection;
    }

    static List<Integer> addToCollection(List <Integer> collection) {
        for (int i = 1; i <= 1000000; i++) {
            collection.add(i);
        }
        return collection;
    }

    static void getFromCollection(List <Integer> collection) {
        SecureRandom random = new SecureRandom();
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            int randomElement = collection.get(random.nextInt(1000000));
            newCollection.add(randomElement);
        }
    }

    static void getTime(List <Integer> collection, String name) {
        Instant startTime = Instant.now();
        getFromCollection(collection);
        Instant finishTime = Instant.now();
        long time = Duration.between(startTime, finishTime).toMillis();
        System.out.println("Время выполнения для " + name + ": " + time + " ms");
    }

}

class User {
    private String name;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getUserScore(Map<String, Integer> map) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        this.name = in.next();

        if (map.get(name) == null)
            System.out.println("Пользователь не найден");
        else {
            int score = map.get(name);
            System.out.println("Количество очков пользователя " + name + ": " + score);
        }
    }

}