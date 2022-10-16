//Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
//        ●	Конструктор, который устанавливает только возраст и название;
//        ●	Конструктор, который устанавливает все переменные в классе;
//        ●	Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
//
//        Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

package JavaLab3.part4;

public class Tree {
    public int age;
    public Boolean isAlive;
    public String name;

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Tree(int age, String name, Boolean isAlive){
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
    }
        public Tree(){
            System.out.println("Пустой конструктор без параметров сработал");
        }

    public void outTree(){
        String value;
        if (isAlive != null && isAlive == true)
        {
            value = "существует";
        }
        else {
            value = "не существует";
        }
        System.out.println("Дерево " + name + " возрастом " + age + " лет " + value);
    }
}
