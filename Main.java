interface Animal {
    final int a=10;
    // Interface method (does not have a body)
    void sound();

    // Default method
    default void sleep() {
        System.out.println("The animal is sleeping.");
        System.out.println(a);
    }
}

class Dog implements Animal {
    // Implementing the interface method
    public void sound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class Cat implements Animal {
    // Implementing the interface method
    public void sound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myDog.sleep(); // Calls default method
        myCat.sound();
        myCat.sleep(); // Calls default method
    }
}
