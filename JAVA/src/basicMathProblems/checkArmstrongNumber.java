package basicMathProblems;

public class checkArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrong(9474));
    }
    public static boolean armstrong(int n){
        if(n == 0){return false;}
        int digits= 0;
        int sum = 0;
        int copy = n;
        int original = n;
        while(n > 0){
            digits++;
            n = n / 10;
        }
        while (copy > 0){
            int rem = copy % 10;
            sum += (int) Math.pow(rem,digits);
            copy = copy / 10;
        }
        return (sum == original);
    }
}
