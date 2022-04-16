package inheritance;

public class OverridingMethodPractice {
    public static void main(String[] args) {

        Tester tester = new Tester();

        tester.eats();
        tester.sleep();
        tester.walk();
        tester.learn();
        tester.code();
        //Tester eats
        //Tester sleeps
        //Person walks
        //Person learns
        //Tester codes
        tester.learn();
        tester.walk();
        //Tester learns
        //Tester walks


    }
}
