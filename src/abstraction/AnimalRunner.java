package abstraction;

public class AnimalRunner {


    public static void main(String[] args) {
        /*
        create 2 animals one Cat, one Sheep and
        make their sounds as necessary
        type their names
        then call them from your objects
         */
      //Reference type         Object type
        Animal animal1 = new Cat("meows", "Tom");
        Animal animal2 = new Sheep("bleats as mee / baa", "Ilkkan");

//        animal1.animalSound();
//        animal1.animalName();

        //Difference between an abstract class and a regular class?
        //Abstract class cannot generate any objects vs Concrete class can have objects
        //Abstract class can have abstract methods and non-abstract methods
        //vs Concrete class can have only concrete methods

        animal2.animalSound();
        animal2.animalName();








    }
}
