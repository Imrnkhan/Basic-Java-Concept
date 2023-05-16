public class ToStringMethod {
    String name;
    int roll;
    String city;

    ToStringMethod(String name,int roll,String city){
        this.name = name;
        this.roll = roll;
        this.city = city;
    }
    public String toString(){
        return name+" "+roll+" "+city;
    }
    
    public static void main(String[] args) {
        ToStringMethod hs = new ToStringMethod("Ram", 90,"gur");
        System.out.println(hs);
    }
    }
