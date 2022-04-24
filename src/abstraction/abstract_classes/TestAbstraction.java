package abstraction.abstract_classes;

import abstraction.abstract_classes.IPhone;
import abstraction.abstract_classes.Nokia;
import abstraction.abstract_classes.Phone;
import abstraction.abstract_classes.Samsung;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called s1
        Samsung, Black, 64, 700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(s1);
        phoneList.add(n1);
        phoneList.add(i1);
        phoneList.forEach(System.out::println);

        /*
        Print all objects
        Find and print the most expensive one with the message ->
        "The most expensive phone is = IPhone"
        Find and print how many phones are convertible -> 2
        */
        int countConvert = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;

        for (Phone phone : phoneList){
            System.out.println(phone);
            if (phone.isConvertible()) countConvert++;
            if (phone.price > max) mostExpensivePhone = phone;
        }
        System.out.println(countConvert);
        System.out.println("Most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());
        System.out.println(mostExpensivePhone.color);

        System.out.println(IPhone.OS); //invoking static instance variables
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phoneList){ //calling methods from Phone
            phone.call();
            phone.ring();
            phone.text();
        }








    }
}
