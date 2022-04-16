package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {

        /*

         */
        Scanner inputReader = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("What is your name?");
        emp.setFullName(inputReader.nextLine());



        System.out.println("What is your age?");
        emp.setAge(inputReader.nextInt());

        inputReader.nextLine();

        System.out.println("What is your address?");
        emp.setAddress(inputReader.nextLine());

        if (emp.getAddress().toUpperCase().contains("chicago")
        && emp.getAge() > 21){
            System.out.println(emp.getFullName() + " is in the club");
        }
        else{
            System.out.println("not in the club");
        }
    }
}
