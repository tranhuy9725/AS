package b1;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    public void play() {
        System.out.println("Dog playing");
    }
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}
