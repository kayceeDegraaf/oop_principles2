package inheritance;

import package5.Singer;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {

        /*
        Give a fName, lName, age, gender, DOB and SSN to all the objects below

        Person 1: John Doe, 45, Male, 01/01/1977, 000-00-0000
        Tester 1: Abe Kim, 20, Male, 01/12/2002, 111-11-1111
        Singer 1: Kaly Ngo, 15, Female, 05/10/2007, 222-22-2222
        Dancer 1: Alona Q, 15, Female, 10/10/2007, 333-33-3333
         */

        Person person1 = new Person();
        person1.fName = "John";
        person1.lName = "Doe";
        person1.age = 45;
        person1.gender = "Male";
        person1.setDOB("01/01/1977");
        person1.setSSN("000-000-000");


        Tester tester1 = new Tester();
        //without anything in tester class can only access methods from object class
        //But after we extend person in tester methods & class instance variables are available
        //Tester extends Person extends Object
        tester1.fName = "Abe";
        tester1.lName = "Kim";
        tester1.age = 20;
        tester1.gender = "Male";
        tester1.setDOB("01/12/2002");
        tester1.setSSN("111-11-1111");



        Singer singer1 = new Singer();
        //imported from package5
        //only methods that come from object are available without doing anything
        //after extend singer to Person -- public, protected methods and instance variables are seen
        //default is not shown because it is not in the same package as Person
        //Singer 1: Kaly Ngo, 15, Female, 05/10/2007, 222-22-2222
        singer1.fName = "Kaly";
        singer1.lName = "Ngo";
        singer1.age = 15;
        singer1.gender = "Female";
        singer1.setDOB("05/10/2007");
        singer1.setSSN("222-22-2222");




        Dancer dancer1 = new Dancer();
        //Dancer 1: Alona Q, 15, Female, 10/10/2007, 333-33-3333
        dancer1.fName = "Alona";
        dancer1.lName = "Q";
        dancer1.age = 15;
        dancer1.gender = "Female";
        dancer1.setDOB("10/10/2007");
        dancer1.setSSN("333-33-3333");

      //  System.out.println(singer1); >> gives location from the heap
        //override to string to print in Person class to every child can use it

        System.out.println(person1);
        System.out.println(tester1);
        System.out.println(singer1);
        System.out.println(dancer1);

            /*
    Give a fName, lName, age, gender, DOB and SSN to all the objects below

    Person 2: Jane Doe, 45, Female, 01/01/1977, 555-55-5555
    Tester 2: Yung Kim, 20, Male, 01/12/2002, 777-77-7777
    Singer 2: Jessie J, 15, Female, 05/10/2007, 666-66-6666
    Dancer 2: B Q, 15, Female, 10/10/2007, 999-99-9999
     */

        Person person2 = new Person("Jane", "Doe", 26, "Female");
        person2.setDOB("01/01/1977");
        person2.setSSN("555-55-5555");
        Tester tester2 = new Tester("Yung", "Kim", 20, "Male");
        tester2.setDOB("01/12/2002");
        tester2.setSSN("777-77-7777");
        Singer singer2 = new Singer("Jessie", "J",15, "Female");
        singer2.setDOB("05/10/2007");
        singer2.setSSN("666-66-6666");
        Dancer dancer2 = new Dancer("B", "Q", 15, "Female");
        dancer2.setDOB("10/10/2007");
        dancer2.setSSN("999-99-9999");

        System.out.println("\n-----person ArrayList-------");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(tester2);
        personList.add(singer2);
        personList.add(dancer2);

        System.out.println();
        System.out.println("Second Task");
        System.out.println();

        personList.forEach(System.out::println); //saying print out each element

        System.out.println("\n-----person ArrayList Another Print-------");

        //another way to print out using .forEach
        personList.forEach(element ->System.out.println(element));

        tester1.code();
        dancer1.dances();
        singer1.sings();






















    }


}
