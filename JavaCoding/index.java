public class index {
    public static void main(String[] args) {
        
        String str = "racar";
        System.out.println(test(str));
    }
    public static boolean test(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left++)!=str.charAt(right++)){
                return false;
            }
        }
        return true;
    }
    
}
