class Animal {  
    void makeSound() {
        System.out.println("Animals make sounds!");
    }
}

class Dog extends Animal {  
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {  
    void makeSound() {
        System.out.println("Cat meows!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  
        Animal myDog = new Dog();       
        Animal myCat = new Cat();       


        myAnimal.makeSound();  
        myDog.makeSound();     
        myCat.makeSound();     
    }
}