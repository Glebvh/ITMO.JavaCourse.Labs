package JavaLab4.part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static JavaLab4.part2.partTwoMain.First;

public class partTwoMain {
    public static void main(String[] args) {

        //2.1
        int[] array = {1,2,3,1,2,4};
//        First(array);
        //2.2
//        Second();
        //2.3
//        Third(array);
        //2.4
//        Fourth(array);
        //2.5
        int[] array2 = new int[21];
        Random rnd = new Random();
        for (int i = 0; i < array2.length;i++){
            array2[i] = rnd.nextInt(100);
            System.out.println(array2[i]);
        }
        int [] sort = Fifth(array2);
        System.out.println(Arrays.toString(sort));
    }
    public static void First(int[] array){
        Boolean result = true;
        for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    result = false;
                }
        }
        if (result)
            System.out.println("Ok");
        else
            System.out.println("Please, try again");
    }
    public static void Second(){

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.print("Array length is " + i + "\n");
        int[] array = new int[i];
        System.out.println("Numbers of array:");
        int j = in.nextInt();
        int k = in.nextInt();
        int h = in.nextInt();
        int g = in.nextInt();
        array[0] = j;
        array[1] = k;
        array[2] = h;
        array[3] = g;
        System.out.println(Arrays.toString(array));
    }
    public static void Third(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i : array) {
             int x = array[0];
             int y = array[array.length - 1];
             array[array.length - 1] = x;
             array[0] = y;
        }
        System.out.println(Arrays.toString(array));
    }
//   	Дан массив чисел. Найдите первое уникальное в этом массиве число.
//      Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
    public static void Fourth (int[] array) {
        for (int i = 0; i < array.length; i++) {
            Boolean result = true;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j] && i != j){
                    result=false;
                }
            }
            if(result) {
                System.out.println(array[i]);
                break;
            }
        }
    }

    public static int[] Fifth(int[] array) {
        System.out.println(Arrays.toString(array));
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[mid];
        } else{
            right = new int[mid+1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }

        left = Fifth(left);
        right = Fifth(right);

        return mergeParts(left, right);
    }
    private static int[] mergeParts(int[] left, int[] right) {
        int [] res = new int[left.length + right.length];

        int leftP = 0;
        int rightP = 0;
        int resultP = 0;

        while (leftP < left.length || rightP < right.length){
            if (leftP < left.length && rightP < right.length){
                if (left[leftP] < right[rightP]) {
                    res[resultP++] = left[leftP++];
                }
                else  {
                    res[resultP++] = right[rightP++];
                }
            } else if (leftP < left.length) {
                res[resultP++] = left[leftP++];
            } else if (rightP < right.length) {
                res[resultP++] = right[rightP++];
            }
        }
        return res;
    }
}

