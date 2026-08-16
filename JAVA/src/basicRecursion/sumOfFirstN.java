package basicRecursion;

public class sumOfFirstN {
    public static void main(String[] args) {
        System.out.println(ex(5));
    }
    public static int ex(int n){
        if(n == 1){
            return 1;
        }
        return n + ex(n-1);
    }
}
