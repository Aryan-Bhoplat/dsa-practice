package basicRecursion;

//public class checkPalindromeString {
//    public static void main(String[] args) {
//        System.out.println(ex("ABCBA",0));
//    }
//    public static boolean ex(String str, int i){
//        int n = str.length();
//
//        if( i >= n/2){
//            return true;
//        }
//        if(str.charAt(i) != str.charAt(n-i-1)){
//            return false;
//        }
//        return ex(str,i+1);
//    }
//}


// Better

// str = str.toLowerCase().replaceAll("[^a-z0-9]","");

public class checkPalindromeString {
    public static void main(String[] args) {
        System.out.println(ex("ABCBA"));
    }
    public static boolean ex(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
