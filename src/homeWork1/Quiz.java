package homeWork1;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        byte correctAnswers = 0;
        byte incorrectAnswers = 0;
        System.out.println("Выберите правильный вариант ответа.");
        String question1 = "\nКак хочет полететь на луну? \n1) Jeff Bezos\n2) Elon Musk\n3) Joe Biden ";
        System.out.println(question1);
        Scanner in1 = new Scanner(System.in);
        String answer1 = in1.nextLine();
        int intAnswer1 = Integer.parseInt(answer1);
        if (intAnswer1 == 2){
            System.out.println("Ура! Это правильный вариант!");
            correctAnswers += 1;
        } else {
            System.out.println("Бууу... неправильный вариант!");
            incorrectAnswers += 1;
        }
        String question2 = "\nКак называется язык програмирования похожий на змею?\n1) Python\n2) Cobra\n3) Anaconda";
        System.out.println(question2);
        Scanner in2 = new Scanner(System.in);
        String answer2 = in2.nextLine();
        int intAnswer2 = Integer.parseInt(answer2);
        if (intAnswer2 == 1){
            System.out.println("Ура! Это правильный вариант!");
            correctAnswers += 1;
        } else {
            System.out.println("Бууу... неправильный вариант!");
            incorrectAnswers += 1;
        }
        String question3 = "\nКакая самая большая пирамида?\n1) Pyramid of Khufu\n2) Pyramid of Khafre\n3) Great Pyramid of Cholula";
        System.out.println(question3);
        Scanner in3 = new Scanner(System.in);
        String answer3 = in3.nextLine();
        int intAnswer3 = Integer.parseInt(answer3);
        if (intAnswer3 == 1){
            System.out.println("Ура! Это правильный вариант!");
            correctAnswers += 1;
        } else {
            System.out.println("Бууу... неправильный вариант!");
            incorrectAnswers += 1;
        }
        System.out.println("\n\nПравильных ответов: " + correctAnswers + "\nНеправильных ответов: " + incorrectAnswers);

    }
}