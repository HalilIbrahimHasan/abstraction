package abstraction;

public class Toyota extends Car{

    String make = "Toyota";
    String model = "Camry";
    int year = 2022;

    @Override
    public void make() {
        System.out.println("My car is "+ make);
    }

    @Override
    public void model() {
        System.out.println("this is a "+model+" model");
    }

    @Override
    public void year() {
        System.out.println("this is the year of my car : "+year);
    }
}
