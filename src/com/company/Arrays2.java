package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        //Создать список ArrayList(динамический массив), заполнить строками, вводимыми пользователем через консоль (до 10 штук).
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random 10 words");
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }
        System.out.println(arrayList);

        // Вывести в консоль строку, содержащую заглавную букву
        for (String item : arrayList) {
            if (Character.isUpperCase(item.charAt(0))) {
                System.out.println("Word that has capital letter:" + item);
            }
        }

        //Найти наименьшую и наибольшую по длине строку в списке
        String shortestString = arrayList.get(0);
        String longestString = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < shortestString.length()) {
                shortestString = arrayList.get(i);
            }
            if (arrayList.get(i).length() > longestString.length()) {
                longestString = arrayList.get(i);
            }
        }
        System.out.println(shortestString + " - Is the shortest string");
        System.out.println(longestString  + " -  Is the longest string");
        arrayList.remove(shortestString);
        arrayList.remove(longestString);
        //Вывести содержимое списка в консоль
        System.out.println(arrayList);
    }


}
