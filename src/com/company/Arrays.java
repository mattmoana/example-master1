package com.company;
import java.lang.Math;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
//        int[] evenArray = new int[10];
        ArrayList<Integer> evenArray = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 100);
            if (firstArray[i] % 2 == 0 && firstArray[i] != 0)  {
                evenArray.add(firstArray[i]);
            }
            System.out.print(firstArray[i] + "  ");
        }
        int smallest = firstArray[0];
        int largest = firstArray[0];
        for (int i = 1; i < firstArray.length; i++) {
            if (firstArray[i] > largest)
                largest = firstArray[i];
            else if (firstArray[i] < smallest)
                smallest = firstArray[i];
        }
        System.out.println("\nLargest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);

        int sum = 0;
        for (int i : firstArray) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(evenArray);
    }

}
