package day9;

public class Main {
    public void speakTry(Animal animal) {
        animal.speak();
    }

    public void main(String[] args) {

        Animal animal = new Animal("Animal");
        Bird bird = new Bird("Yellow");
        Dog dog = new Dog ("Karabas");
        Horse horse = new Horse("WhiteLight");

        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();

        Animal animal2 = new Bird("Orange");
        animal2.speak();

        speakTry(new Bird("Limon"));
    }
}
