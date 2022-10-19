//Создайте класс Дом. Добавьте в него следующие данные:
//        поля: количество этажей, год постройки, наименование;
//        метод для установки всех значений;
//        метод для вывода всех значений;
//        метод, возвращающий количество лет с момента постройки.
//
//        На основе класса создайте два объекта и пропишите для каждого характеристики.
//        Добавление характеристик реализуйте через метод класса.
//
//        Выведите информацию про каждый объект.


        package JavaLab3.part3;

import java.util.Scanner;

public class House {
    public int floors;
    public int year;
    public String name;

    public void setHouse(int floors, int year, String name){
        this.floors = floors;
        this.year = year;
        this.name = name;
    }
    public void outHouse(){
        System.out.println("Number of floors: " + floors + ", Date: " + year + ", Name: " + name + ", Age: " + Age());
    }
    public int Age(){
        int age = thisAge() - year;
        return age;
    }

    public int thisAge () {
        Scanner in = new Scanner(System.in);
        int thisAge = in.nextInt();
        return thisAge;
    }

}
