import java.security.PKCS12Attribute;

public class SuperConstructor {
    SuperConstructor(){

        System.out.println("this main constrictor method");
    }
    
    
}
class childclass extends SuperConstructor{
    
    childclass(){
        super();
        System.out.println("chid class costrictor");
    }
}
class test{
    public static void main(String[] args) {
        childclass hd = new childclass();
        
    }
}