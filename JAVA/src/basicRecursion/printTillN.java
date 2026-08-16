package basicRecursion;

import java.util.Scanner;

public class printTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        recFunction(n);
    }
    public static void recFunction(int n){
        if (n == 0){
            return;
        }

        recFunction(n-1);
        System.out.print(n+" ");
    }
}
