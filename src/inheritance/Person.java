package inheritance;

public class Person {

    public Person(){

    }

    public Person(String fName, String lName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    } //created with generate constructor

    //instance variables
    public String fName;
    public String lName;
    protected int age;
    protected String gender;
    double weight; //default
    double height; //default
    private String DOB; //not shown in PersonTest class
    private String SSN; //not shown in PersonTest class

    public void sleep(){
        System.out.println("Person sleeps");
    }

    public void learn(){
        System.out.println("Person learns");
    }

    public void walk(){
        System.out.println("Person walks");
    }

    public void eats(){
        System.out.println("Person eats");
    }

    //created getter and setter for below because they are private
    //whatever is done is parent is reflected in child classes

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    //edited so when the object is printed in Test class each line is named correctly
    @Override
    public String toString() {
        return this.getClass() .getSimpleName() + "{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
