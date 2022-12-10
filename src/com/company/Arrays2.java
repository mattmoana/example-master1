package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        String shortest= "";
        ArrayList<String> arrayList = new ArrayList<>();
//        int longest = arraylist.get(0).length();;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }
        System.out.println(arrayList);

        for (String item : arrayList) {
            if (Character.isUpperCase(item.charAt(0))) {
                System.out.println(item);
            }
        }
    }
}
