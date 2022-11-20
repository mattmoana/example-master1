package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line = "Введите число: ";
        System.out.println(line);
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        Integer intNumber = Integer.parseInt(number);
        if (intNumber == 5){
            System.out.println(intNumber + intNumber);
        } else {
            System.out.println("Error!");
        }
    }
}
