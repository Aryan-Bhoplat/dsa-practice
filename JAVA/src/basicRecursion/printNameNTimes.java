package basicRecursion;

public class printNameNTimes {
    public static void main(String[] args) {
        recFunction(3);
    }
    public static void recFunction(int n){
        if (n == 0){
            return;
        }
        System.out.println("Name");

        recFunction(n-1);

    }
}
