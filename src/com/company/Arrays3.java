package com.company;

import java.util.List;
import java.util.Random;

public class Arrays3 {

    //1.3
    //Создать массив, в котором содержатся строки с временами года.
    // При помощи конструкции switch-case сделать вывод в консоль месяцев, соответствующих времени года.
    // Выбор времени года реализовать через псевдорандом Math.
    public static void main(String[] args) {

        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};

        Random random = new Random();
        int seasonIndex = random.nextInt(4);

        switch(seasons[seasonIndex]) {
            case "Spring":
                System.out.println("March, April, May");
                break;
            case "Summer":
                System.out.println("June, July, August");
                break;
            case "Fall":
                System.out.println("September, October, November");
                break;
            case "Winter":
                System.out.println("December, January, February");
                break;
            default:
                System.out.println("Check");
        }
    }
}