public class overriding {
 void run(){
    System.out.println("run method ");
}
}
class bike extends overriding{
    @Override
    void run(){
        System.out.println("dog method");
    }
public static void main(String[] args) {
    bike hs = new bike();          // which you wnat on run
    hs.run();

    // overriding bh = new overriding();
    // bh.run();
}
    
}


// same mathod and same class - overloading