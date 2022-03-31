package abstraction;

import java.util.List;

public class CarRunner {

    public static void main(String[] args) {

        //reference    object
        Car car     =   new Toyota();
        //Inheritance
        //Abstraction
        //Poly morphisme
        //when we create an abstract class, we cannot create
        // an object from Abstract class, but we can use abstract class as
        //reference type


//        car.make();//Toyota
//        car.model();//Camry
//        car.year();//2022

        Car car2 = new Honda();

        car2.make();//Honda
        car2.model();//
        car2.year();





    }




}
