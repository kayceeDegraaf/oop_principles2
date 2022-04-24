package polymorphism;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {

        Cat cat1 = new Cat(); //no casting -- cat in the shape of cat

        /*
        up casting
        -putting smaller data into bigger - widening
        -it happens automatically
         */

        Animal animal1 = new Cat(); //up casting
        List<Animal> animals = new ArrayList<>(); //up casting Arraylist in the shape of List
        Object object1 = new Cat(); // upcasting cat into shape of object

        /*
        down casting
        -putting bigger data into smaller
        -happens explicitly
        BUT: there could be data loss with primitives
        There can be exceptions thrown with object if done improperly
         */

        //Dog dog1 = (Dog) new Animal(); // have to cast to Dog
        //System.out.println(dog1);
        //will get error this way^^

        Animal a1 = new Dog(); //this is dog in the shape of Animal -- up cast
        Dog dog1 = (Dog)a1; //down casting dog to animal

        a1.eat(); //dog eats
        dog1.eat(); //dog eats








    }
}
