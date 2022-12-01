package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1.1 Вывести в консоль максимальное и минимальное значения типа int, используя класс Integer
        System.out.println("Integer min value is: " + Integer.MIN_VALUE);
        System.out.println("Integer max value is: " + Integer.MAX_VALUE);


        //1.2 В переменную записать 3х значное натуральное число, вывести в консоль сумму цифр числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите число: ");
        int i = scanner.nextInt();
        int sum = 0;
        while (i!=0){
            sum += i % 10;
            i /= 10;
        }
        System.out.println("Сумма цифр цисла: " + sum);

        //1.3 В переменные x и y записать два натуральных числа, вывести в консоль остаток от деления x и y
        System.out.println("\nВведите 1е натуральное число: ");
        int x = scanner.nextInt();
        System.out.println("Введите 2е натуральное число: ");
        int y = scanner.nextInt();
        int z = x % y;
        System.out.println("Остаток от деления этих двух чисел: " + z);

        square();
    }
    public static void square() {
        //1.4 Напишите метод, который будет вычислять площадь прямоугольника и выводить результат в консоль, вызовите этот из main
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите сторону а: ");
        int a = scanner.nextInt();
        System.out.println("Введите сторону б: ");
        int b = scanner.nextInt();
        int squareOfNumbers = a * b;
        System.out.println("Площадь прямоугольника: " + squareOfNumbers);
    }

}


