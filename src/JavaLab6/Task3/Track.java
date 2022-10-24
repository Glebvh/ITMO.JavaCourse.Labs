package JavaLab6.Task3;

public class Track extends Car {

    protected Integer wheelsNum;
    protected Integer maxWeight;

    public Track(int w, String m, char c, float s, Integer wheelsNum, Integer maxWeight) {
        super(w, m, c, s);
        this.wheelsNum = wheelsNum;
        this.maxWeight = maxWeight;
    }

    public void newWheels (int wheelsNum) {
        this.wheelsNum = wheelsNum;
        System.out.println(wheelsNum);
    }

    @Override
    public String toString() {
        return "Track{" +
                "wheelsNum=" + wheelsNum +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
