package encapsulation;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();

        //setting info for make
        car1.make = "BMW";

        //getting info of make
        System.out.println(car1.make);

        //setting info for year
        car1.setYear(2020);

        //getting year
        System.out.println(car1.getYear());

        car1.setPrice(5000, "abcd1234");
        System.out.println("$" + car1.getPrice());

        car1.setPrice(4000, "abcd1234");
        System.out.println("$" + car1.getPrice());

        System.out.println(car1.getIsConvertible());
    }
}
