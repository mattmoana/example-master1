package com.company;

public class Dogs {
    String name;
    int age;
    boolean isAngry;

    public Dogs() {                    // <===============  CONSTRUCTOR WITHOUT PARAMETERS ==================>
        this.name = "Hitachi";
        this.age = 10;
    }

    public Dogs(String name, int age) {    // <===============  CONSTRUCTOR WITH PARAMETERS ==================>
        this.name = name;
        this.age = age;
    }

    public Dogs(String name, int age, boolean isAngry) {    // <===============  CONSTRUCTOR WITH PARAMETERS ==================>
        this.name = name;
        this.age = age;
        this.isAngry = isAngry;
    }

    public void sayBark() {
        System.out.println("Bark, bark bark!");
    }

    public String sayWoof() {
        return "Woof";
    }

    public void smartDogMultiply(int one, int two) {
        System.out.println("Here is how smartDog multiplies " + one * two);
    }

    public float smartDogDivides(float one, float two) {
        return one / two;
    }
}