interface Walkable {
    void walk();
}

interface Swimable {
    void swim();
}

class Animal {
    void eat() {
        System.out.println("Happy Eating....");
    }
}

class Mammal extends Animal {
    void birth() {
        System.out.println("Mammal give birth....");
    }
}

class Dog extends Mammal implements Walkable {
    void bark() {
        System.out.println("Happy Barking....");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }
}

public class Hello {
    public static void main(String args[]) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
        obj.birth();
        obj.walk();
    }
}
