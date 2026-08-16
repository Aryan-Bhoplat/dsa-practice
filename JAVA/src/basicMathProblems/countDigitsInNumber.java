package basicMathProblems;
import java.util.Scanner;
public class countDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        System.out.println("The length of "+n+" is "+ex(n));
        sc.close();
    }
    public static int ex(int n){
        int count = 0;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            count++;
            n = n / 10;
        }
        System.out.println("Reversed number: "+rev);
        return count;
    }
}


// Advance
//class Solution {
//
//    public int reverse(int x) {
//        int rev = 0;
//        while( x != 0){
//            int rem = x % 10;
//            if( rev > Integer.MAX_VALUE / 10|| rev == Integer.MAX_VALUE / 10 && rem > 7){
//                return 0;
//            }
//            if( rev < Integer.MIN_VALUE / 10|| rev == Integer.MIN_VALUE / 10 && rem < -8){
//                return 0;
//            }
//
//            rev = rev * 10 + rem;
//            x= x / 10;
//        }
//        return (int)rev;
//    }
//
//}