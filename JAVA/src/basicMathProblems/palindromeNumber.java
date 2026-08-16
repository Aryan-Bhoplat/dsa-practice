package basicMathProblems;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        if( n == ex(n)){
            System.out.println(n+" is Palindrome number");
        }
        else{
            System.out.println(n+" is Not a Palindrome number");
        }
        System.out.println("Reverse of "+ n+" is: "+ex(n));
    }
    public static int ex(int n){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev;
    }
}
