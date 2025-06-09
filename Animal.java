class Animals {  
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

public class Animal{
    public static void main(String[] args) {
        Animals myAnimal = new Animals();  
        Animals myDog = new Dog();       
        Animals myCat = new Cat();       

        myAnimal.makeSound();  
        myDog.makeSound();     
        myCat.makeSound();     
    }
}