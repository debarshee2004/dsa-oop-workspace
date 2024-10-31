// Parent class
class Animal {
    // Method to be overridden by subclasses
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method from the Animal class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test method overriding
class Overriding {
    public static void main(String[] args) {
        // Creating an object of the parent class (Animal)
        Animal myAnimal = new Animal();
        myAnimal.sound();
        // Calls the Animal class's sound() method

        // Creating an object of the child class (Dog)
        Dog myDog = new Dog();
        myDog.sound();
        // Calls the Dog class's overridden sound() method

        // Using polymorphism to reference a Dog object with an Animal type
        Animal myAnimalDog = new Dog();
        myAnimalDog.sound();
        // Calls the Dog class's overridden sound() method due to runtime polymorphism
    }
}
