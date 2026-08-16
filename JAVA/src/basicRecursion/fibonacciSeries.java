package basicRecursion;

public class fibonacciSeries {
    public static void main(String[] args) {
        ex(6);
    }

    public static void ex(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        if(n == 0){
            System.out.println(0);
        }else if(n == 1){
            System.out.println("0 1");
        } else{
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }

        }

        for (int k: fib){
            System.out.print(k+" ");
        }
    }
}
