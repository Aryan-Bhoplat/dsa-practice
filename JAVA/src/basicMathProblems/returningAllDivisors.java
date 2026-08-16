package basicMathProblems;

public class returningAllDivisors {
    public static void main(String[] args) {
        ex(36);
    }
    public static void ex(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i+" ");

            }
        }


    }
}
