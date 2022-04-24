package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {
        /*
        Alex, John, Max
         1 2 3 4 5

         */
        //every element below is an Object
        Object[] elements = {5, 10.5, '*', "Alex", true, new Dog(), new Scanner(System.in),
                new ArrayList<>(), new String[5]};
        for (Object element : elements) {
            System.out.println(element.getClass().getSimpleName());
            //Integer//Double//Character//String//Boolean//Dog//Scanner//ArrayList//String[]
        }
        Dog dog1 = (Dog)elements[5]; //cast to dog to get dog methods
        dog1.bark();
        dog1.sleep();

        String name = (String) elements[3]; //cast to String
        System.out.println(name.startsWith("A"));

    }
}
