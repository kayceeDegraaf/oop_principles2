package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {

         /*
        Create a food object and define below info for it
        taste = delicious
        name = sushi
        isSpicy = true
        isOrganic = true

        And, print it
         */

        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "Sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

         /*
        Create a food object and define below info for it
        taste = good
        name = parsley
        isSpicy = false
        isOrganic = true
        color = green;

        First, print the name of the veg and the color
        Then, print if the veg is organic
        Finally, print the object itself
         */

        Vegetable vegetable1 = new Vegetable();
        vegetable1.taste ="good";
        vegetable1.name = "parsley";
        vegetable1.isSpicy = false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic()); //call method not set
        System.out.println(vegetable1);
        //Vegetable{taste='good', name='parsley', isSpicy=false, isOrganic=true, color='green'}
        //got this output once we did override in the veg class
        //in veg override to string, type in organic

        /*
        create vegetable2 and define only the name
        print the object
         */

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name ="broccoli";
        System.out.println(vegetable2);
        //Vegetable{taste='null', name='broccoli', isSpicy=false, isOrganic=false, color='null'}

        /*

         */

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(food1);
        foodList.add(vegetable1);
        foodList.add(vegetable2);
        foodList.forEach(System.out::println);

        /*
        count how many food names have more than 5 characters
        count = 2
         */
        System.out.println("\n--count enhanced for loop--");

        int count = 0;
        for (Food food : foodList){
            if (food.name.length() > 5){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n---count task bonus solution--");
        //int count2;
        int count2 = (int) foodList.stream().filter(food -> food.name.length() > 5).count();
        System.out.println(count2);









    }
}
