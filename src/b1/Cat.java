package b1;

public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}
