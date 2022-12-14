package JavaLab9;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Lab9Main {
    public static void main(String[] args) {

        //////// Task 1
//        List<Integer> collection = new ArrayList<>();
//        collection.add(1);
//        collection.add(1);
//        collection.add(2);
//        collection.add(2);
//        collection.add(3);
//        collection.add(3);
//
//        System.out.println(collection);
//
//        Set<Integer> newCollection = deleteDoubles(collection);
//
//        System.out.println(newCollection);
//
//        ////////Task 2
//        List<Integer> emptyArrayList = new ArrayList<>();
//        List<Integer> arrayList = addToCollection(emptyArrayList);
//        getTime(arrayList, "ArrayList");
//
//        List<Integer> emptyLinkedList = new LinkedList<>();
//        List<Integer> linkedList = addToCollection(emptyLinkedList);
//        getTime(linkedList, "LinkedList");

        ////////Task3
        Map<User, Integer> map = new HashMap<>();
        User user1 = new User("Igor");
        User user2 = new User("Ivan");
        User user3 = new User("Maria");
        map.put(user1, 10);
        map.put(user2, 15);
        map.put(user3, 20);

        User.getUserScore(map);
    }

    static Set<Integer> deleteDoubles(List<Integer> collection) {
        Set<Integer> editedCollection = new HashSet<>(collection);
        return editedCollection;
    }

    static List<Integer> addToCollection(List<Integer> collection) {
        for (int i = 1; i <= 1000000; i++) {
            collection.add(i);
        }
        return collection;
    }

    static void getFromCollection(List<Integer> collection) {
        SecureRandom random = new SecureRandom();
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            int randomElement = collection.get(random.nextInt(1000000));
            newCollection.add(randomElement);
        }
    }

    static void getTime(List<Integer> collection, String name) {
        Instant startTime = Instant.now();
        getFromCollection(collection);
        Instant finishTime = Instant.now();
        long time = Duration.between(startTime, finishTime).toMillis();
        System.out.println("?????????? ???????????????????? ?????? " + name + ": " + time + " ms");
    }

}

class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getUserScore(Map<User, Integer> map) {

        Scanner in = new Scanner(System.in);
        System.out.println("?????????????? ?????? ????????????????????????:");
        String name = in.next();

        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            if (pair.getKey().getName().equals(name)) {
                Integer score = pair.getValue();
                System.out.println("???????????????????? ?????????? ???????????????????????? " + name + ": " + score);
            }
        }
    }
}