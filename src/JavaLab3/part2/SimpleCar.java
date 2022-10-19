//Создайте простой класс, который будет иметь поля: цвет, название, вес.
// Создайте метод в классе через который можно будет вывести все эти данные.
// Добавьте два объекта, установите для них значения и выведите все при помощи ранее созданного метода.
// Также добавьте несколько конструкторов, которые будут устанавливать:
//        только цвет машины;
//        цвет и вес машины;
//        и пустой конструктор.

package JavaLab3.part2;

public class SimpleCar {
    private String color;
    private String name;
    private int weight;

    void Output() {
        System.out.println("Color: " + color + "," + "Name: " + name + "," + "Weight: " + weight);
    }

    public SimpleCar() {
    }

    public SimpleCar(String color) {
        this.color = color;
    }

    public SimpleCar(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

}
