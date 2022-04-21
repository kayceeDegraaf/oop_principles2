package abstraction.abstract_classes;

public interface BlueTooth {

    //everything in interface is public & methods are by default
    //3 types of methods allowed: abstract, static, default
    void connectBlueTooth();


    //static method
    static int getYear(){
        return 2022;
    }

    //default method (non-static method that has a body)
    default boolean isConnected(){
        return true;
    }
}
