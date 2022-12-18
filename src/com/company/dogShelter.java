package com.company;

public class dogShelter {
    public static void main(String[] args) {
        Dogs husky = new Dogs();
        Dogs beagle = new Dogs();
        System.out.println("Dogs name is " + husky.name + " his age is " + husky.age);
        System.out.println("Dogs name is " + beagle.name + " his age is " + beagle.age);

        Dogs shepard = new Dogs( "Charles", 14);   // <===============  WE USED CONSTRUCTOR WITH PARAMETERS ==================>
//        shepard.name = "Charles";
//        shepard.age = 5;
        System.out.println("Dogs name is " + shepard.name + " his age is " + shepard.age);
        shepard.sayBark();

        Dogs Chihuahua = new Dogs("Sam", 8, true);
        if (Chihuahua.isAngry) {
            System.out.println("Chihuahua Sam is an angry dog!");
            Chihuahua.sayWoof();
        }   else {
                Chihuahua.sayBark();
            }


        Dogs labrador = new Dogs();
        labrador.name = "Tommy";
        labrador.age = 3;
        labrador.isAngry = false;
        String labradorCanWoof = labrador.sayWoof();
        System.out.println(labradorCanWoof);

        husky.smartDogMultiply(3, 100);

        float divideResult = beagle.smartDogDivides(100,13);
        System.out.println("Dog can divide and the result is " + divideResult);

        Dogs Corgi = new Dogs();
        System.out.println("Dogs name is " + Corgi.name + " his age is " + Corgi.age);
    }

}

