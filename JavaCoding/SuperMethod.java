public class SuperMethod {
    void disp(){
        System.out.println("main method of class");
    }

}
class childs extends SuperMethod{
    void disp(){
        System.out.println("Second method");
    }

    void print(){
8        disp();
        super.disp();
    }
    
    public static void main(String[] args) {
        
        childs hs = new childs();
        hs.print();
    }
    }

