package JavaLab3.part4;

public class TreeMain {
    public static void main(String[] args) {
        Tree twoParams = new Tree(300,"Дуб");
        twoParams.outTree();
        Tree allParams = new Tree(20, "Сосна", true);
        allParams.outTree();
        Tree message = new Tree();
    }
}
