package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("----Cat Object---");
        cat1.sleep();
        cat1.eat();
        cat1.eat("fish");

        System.out.println("----Dog Object----");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("----Animal Object----");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat("some food");
        animal1.sleep();

        /*
        Create a Cat and a Dog object in the shape of Animal
        Invoke their eat() and sleep() methods which are zero arg
         */

        System.out.println("----Cat and Dog Object in Animal Shape---");
        Animal animal2 = new Dog();
        animal2.eat(); //Dog eats
        animal2.sleep(); //Dog sleeps

        Animal animal3 = new Cat();
        animal3.eat(); //cat eats
        animal3.sleep(); //cat sleeps


        System.out.println("---Animal Array with Cat, Dog, Animal123---");
        //Animal, Cat, Dog
        //Can't make the array Dog or Cat needs to be Animal
        Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            //Cat, Dog, Animal, Dog, Cat
        }

        //Store all objects in an ArrayList and execute eat() method
        //for each object

        System.out.println("----ArrayList Collection of Animals---");

        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));
        for (Animal animal : animalList) {
            animal.eat();
        }
        //cat eats//Dog eats//Animal eats//Dog eats//cat eats








    }
}
