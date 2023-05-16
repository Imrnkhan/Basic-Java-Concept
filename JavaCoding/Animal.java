

public class Animal {
    protected String name; // filed
    
    public Animal(String name) {     //constructor
        this.name = name;
    }
    
    public void makeSound() {
        System.out.println("Some generic animal sound");     //method name 
    }
}

public class Dog extends Animal {             // extend old to new inherit
    public Dog(String name) {                   // constructor
        super(name);                               //super constrtor
    }
    
    @Override
    public void makeSound() {               // method make
        System.out.println("Bark bark!");
    }
}

public class Cat extends Animal {     //extend and inherit
    public Cat(String name) {
        super(name);                  //
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal");
        animal.makeSound(); // prints "Some generic animal sound"
        
        Dog dog = new Dog("Fido");
        dog.makeSound(); // prints "Bark bark!"
        
        Cat cat = new Cat("Whiskers");
        cat.makeSound(); // prints "Meow!"
    }
}
