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

        List<Integer> newCollection = deleteDoubles(collection);

        deleteDoubles(collection);

        System.out.println(newCollection);

        ////////Task 2
        List<Integer> emptyArrayList = new ArrayList<>();
        List<Integer> collectionArrayList = addToArrayList(emptyArrayList);
//        System.out.println(collectionArrayList);
        getFromArrayList(collectionArrayList);

        List<Integer> emptyLinkedList = new LinkedList<>();
        List<Integer> collectionLinkedList = addToLinkedList(emptyLinkedList);
//        System.out.println(collectionLinkedList);
        getFromLinkedList(collectionLinkedList);

        ////////Task3
        Map <String, Integer> map =  new HashMap<>();
        map.put("Igor", 10);
        map.put("Ivan", 15);
        map.put("Maria", 20);

        User user = new User();
        user.getUserScore(map);
    }

    static List<Integer> deleteDoubles(List collection) {
        Set<Integer> editedCollection = new HashSet<>(collection);
        List<Integer> editedToList = new ArrayList<>(editedCollection);
        return editedToList;
    }

    static List<Integer> addToArrayList(List collection) {
        List<Integer> added = new ArrayList<>(collection);
        for (int i = 1; i <= 1000000; i++) {
            added.add(i);
        }
        return added;
    }

    static void getFromArrayList(List collection) {
        Instant startTime = Instant.now();
        SecureRandom random = new SecureRandom();
        List<Integer> getFromArray = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            int randomElement = (int) collection.get(random.nextInt(1000000));
            getFromArray.add(randomElement);
        }
//        System.out.println(getFromArray);
        Instant finishTime = Instant.now();
        long time = Duration.between(startTime, finishTime).toMillis();
        System.out.println("Время выполнения для ArrayList " + time + " ms");
    }

    static List<Integer> addToLinkedList(List collection) {
        List<Integer> added = new LinkedList<>(collection);
        for (int i = 1; i <= 1000000; i++) {
            added.add(i);
        }
        return added;
    }

    static void getFromLinkedList(List collection) {
        Instant startTime = Instant.now();
        SecureRandom random = new SecureRandom();
        List<Integer> getFromLinked = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            int randomElement = (int) collection.get(random.nextInt(1000000));
            getFromLinked.add(randomElement);
        }
//        System.out.println(getFromArray);
        Instant finishTime = Instant.now();
        long time = Duration.between(startTime, finishTime).toMillis();
        System.out.println("Время выполнения для LinkedList " + time + " ms");
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

    public void getUserScore(Map<String, Integer> map){

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