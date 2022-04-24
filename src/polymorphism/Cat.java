package polymorphism;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("cat eats");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeps");
    }


}
