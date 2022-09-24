package day9;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal can speak ...");
    }

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
}
