package OOP;

public class Dog extends Pet{
    //Создайте класс наследник Dog от класса Pet.
    public Dog(String color) {
        super(color);
    }
    //В классе Dog создайте метод sayBark, который выводит на экран “Гав-гав”.
    public void sayBark(){
        System.out.println ("Гав-гав");
    }

}