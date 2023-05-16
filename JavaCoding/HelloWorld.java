abstract class demo{
    abstract void eat();
}
class dog extends demo{

    @Override
    void eat() {
     System.out.println("dog is eating");
        
    }
    public static void main(String[] args) {
        demo hs = new dog();
        hs.eat();
    }
    
}