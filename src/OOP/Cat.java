package OOP;


//Создайте класс наследник Cat от класса Pet.
public class Cat extends Pet {


    public Cat(String color) {
        super(color);
    }

    public void sayMeow() {
        System.out.println ("Мяу-мяу");
    }
}