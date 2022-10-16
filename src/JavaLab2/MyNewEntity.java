package JavaLab2;

public class MyNewEntity {
    private String size;
    private int quantity;
    private Boolean isExist;

    public MyNewEntity(){
    }
    public MyNewEntity(String size){
        this.size = size;
    }
    public MyNewEntity(String size,int quantity){
        this.size = size;
        this.quantity = quantity;
    }
    public MyNewEntity(String size,int quantity,Boolean isExist){
        this.size = size;
        this.quantity = quantity;
        this.isExist = isExist;
    }
}
