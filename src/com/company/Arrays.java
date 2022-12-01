package com.company;
import java.lang.Math;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.print(numbers[i] + "  ");
        }
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("\nLargest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
        int [] a = new int[10 * (int) (Math.random() * 100) ];

        for (int i = 0; i < a.length; i++) {
            System.out.printf( "%d\n", a[i] );
        }


    }

}
