abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat: Meow!");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 5);

        dog.makeSound(); // Output: Dog: Woof!
        cat.makeSound(); // Output: Cat: Meow!
    }
}