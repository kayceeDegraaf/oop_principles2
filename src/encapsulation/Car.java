package encapsulation;

public class Car {
    //instance variables
    public String make;
    private int year;
    private double price; //require a password
    private boolean isConvertible = true;
    //no one can reset this to false
    //don't provide set
    //provide get, so they can call / read in another class

    public int getYear() {
        return year;
    }

    //providing indirect access to year to set and get
    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price, String adminPassword) {
        if (adminPassword.equals("abcd1234"))
        this.price = price;
        else throw new RuntimeException("The password is wrong");
    }
    public boolean getIsConvertible(){
        return isConvertible;
    }
}
