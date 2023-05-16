    class Animal {

        // field and method of the parent class
        String name;
        public void eat() {
          System.out.println("I can eat");
        }
      }
      
      // inherit from Animal
      class Dog extends Animal {
      
        // new method in subclass
        public void display() {
          System.out.println("My name is " + name);
        }
      }
      
      class Main {
        public static void main(String[] args) {
      
          // create an object of the subclass
          Dog labrador = new Dog();
      
          // access field of superclass
          labrador.name = "Rohu";
          labrador.display();
      
          // call method of superclass
          // using object of subclass
          labrador.eat();
      
        }
      }
    




      /*

       public class Animal {
    protected String name;
    
    public Animal(String name) {             // constructor that takes a name parameter
        this.name = name;                   // assigns the name parameter to the "name" property
    }
    
    public void makeSound() {                // method that prints a generic animal sound
        System.out.println("Some generic animal sound");
    }
}

public class Dog extends Animal {             // Dog class extends the Animal class
    public Dog(String name) {                 // constructor that takes a name parameter
        super(name);                          // calls the superclass constructor with the name parameter
    }
    
    @Override                                  // annotation that indicates the following method overrides a superclass method
    public void makeSound() {                  // overrides the superclass method
        System.out.println("Bark bark!");      // prints a dog-specific sound
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal");   // creates an Animal object with the name "Generic animal"
        animal.makeSound();                         // calls the makeSound method of the Animal object, which prints "Some generic animal sound"
        
        Dog dog = new Dog("Fido");                   // creates a Dog object with the name "Fido"
        dog.makeSound();                            // calls the makeSound method of the Dog object, which prints "Bark bark!"
    }
}

       */