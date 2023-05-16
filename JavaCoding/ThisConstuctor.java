public class ThisConstuctor {
    int id ;
    String name;

    ThisConstuctor(){


    }
    ThisConstuctor(int id,String name){
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        ThisConstuctor bh = new ThisConstuctor();
        System.out.println(bh.id+" "+bh.name);
        ThisConstuctor vb = new ThisConstuctor(89, "Amir");
        System.out.println(vb.id+" "+vb.name);

        
    }
    
}
