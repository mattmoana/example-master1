package OOP;

//В методе main создайте объекты Cat и Dog.
public class Main {
    public static void main(String[] args) {
        Cat Cat = new Cat("Red");
        Dog Dog = new Dog ("Grey");

        //Вызовите их методы sayMeow и sayBark.
        Cat.sayMeow();
        Dog.sayBark();

    }
}