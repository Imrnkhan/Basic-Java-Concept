import java.security.Timestamp;

public class ThisCurrentObj {
    int id;
    String name;
    
    
    ThisCurrentObj(int id ,String name){
        this.id = id;
        this.name = name;
        
    }
    void dis(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        ThisCurrentObj hd = new ThisCurrentObj(90, "sahil");
hd.dis();

//anothe way to exute same answer
// System.out.println(hd.id+" "+hd.name);
        
    }
}