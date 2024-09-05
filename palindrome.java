public class palindrome {
    
    public static boolean ispalin(String str){
        int n= str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "Noon";
       
        System.out.println( ispalin(str));

    }
}
