public class constructorOverloading {
    int id;
    String name;

    // public constructorOverloading(int id, String name) {
    //     this.id = id;
    //     this.name = name;
    // }
    // public constructorOverloading() {
    // }

    constructorOverloading(){
        
    }
    constructorOverloading(int id,String name){
      this.id = id;
      this.name = name;
    }
    public static void main(String[] args) {
        constructorOverloading hs = new constructorOverloading();
        constructorOverloading bh = new constructorOverloading(90, "sahid");
        System.out.println(hs.id+" "+ hs.name);
        System.out.println(bh.id+" "+bh.name);
    }
    
}
