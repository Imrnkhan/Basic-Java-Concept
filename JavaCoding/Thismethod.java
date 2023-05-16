public class Thismethod {
    void m(){
        this.n();
        System.out.println("method disp running");
    }
    void n(){
        System.out.println("method diop is running");
    }
    
    public static void main(String[] args) {
        Thismethod hs = new Thismethod();
        hs.m();
        
    }
}

