//Создать класс, который обозначает какую-либо сущность.
//Определить у него несколько конструкторов - конструктор по умолчанию и конструктор со всеми параметрами.
//Определить для него несколько параметров.


package JavaLab2;

public class MyNewEntity {
    private String size;
    private int quantity;
    private Boolean isExist;

    public MyNewEntity() {
    }

    public MyNewEntity(String size) {
        this.size = size;
    }

    public MyNewEntity(String size, int quantity) {
        this.size = size;
        this.quantity = quantity;
    }

    public MyNewEntity(String size, int quantity, Boolean isExist) {
        this.size = size;
        this.quantity = quantity;
        this.isExist = isExist;
    }

    @Override
    public String toString() {
        return "MyNewEntity{" +
                "size='" + size + '\'' +
                ", quantity=" + quantity +
                ", isExist=" + isExist +
                '}';
    }

    public static void main(String[] args) {

        MyNewEntity x = new MyNewEntity("100 метров", 10, true);
        System.out.println(x);

    }
}

