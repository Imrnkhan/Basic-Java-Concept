public interface MultiplaInheritance {
    void demo();
    
}
interface printble{
    void run();
}

class Demo implements MultiplaInheritance,printble{

    @Override
    public void run() {
System.out.println("Run method");        
    }

    @Override
    public void demo() {
System.out.println("Demo method");        
    }
    
}
class Test{
    public static void main(String[] args) {
        Demo hs =new Demo();
        hs.run();
        hs.demo();
    }
}
