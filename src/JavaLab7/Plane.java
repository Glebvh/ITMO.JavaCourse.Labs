package JavaLab7;

import java.util.Scanner;

public class Plane {

    public static class Wing {

        protected int wingWeight;

        public void weightPrint(int wingWeight) {
            this.wingWeight = wingWeight;
            System.out.printf("Weight is %s", wingWeight);
        }
    }

    public static void main(String[] args) {

        Plane.Wing wing = new Plane.Wing();
        wing.weightPrint(777);


    }
}

