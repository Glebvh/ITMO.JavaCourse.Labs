package JavaLab7;

import java.util.Scanner;

public class Plane {

    public static class Wing {

        protected int wingWeight;

        public void weightPrint(int wingWeight) {
            System.out.printf("Weight is %s", this.wingWeight);
        }
    }

    public static void main(String[] args) {

        Plane.Wing wing = new Plane.Wing();
        wing.weightPrint(100);


    }
}

