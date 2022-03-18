package abstraction;

public class Cat extends Animal{


    String sound;
    String name;

    public Cat (String sound, String name){
        this.sound = sound;
        this.name = name;
    }

    @Override
    public void animalSound() {
        System.out.println("sound of the animal is "+sound);
    }

    @Override
    public void animalName() {
        System.out.println("name of the animal is "+name);
    }
}
