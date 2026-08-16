package regularPractice;

public class one {
    public static void main(String[] args) {
        System.out.println(countDigits(1234321));
        System.out.println(revNumber(123));
        System.out.println(palindrome(-121));
        System.out.println(gcd(15,30));
        System.out.println(armstrong(153));
        divisors(30);
        System.out.println(prime(13));
    }
    public static int countDigits(int n){
        if(n == 0){return 1;}
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static int revNumber(int num){
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }

    public static boolean palindrome(int x){
        if(x < 0){
            return false;
        }
        int rev = 0;
        int original = x;
        while(x > 0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return (rev == original);
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean armstrong(int t){
        int digits = 0;
        int sum = 0;
        int copy = t;
        int og = t;
        while (t > 0){
            digits++;
            t /= 10;
        }

        while(copy > 0){
            int rem = copy % 10;
            sum = sum + (int)Math.pow(rem,digits);
            copy /= 10;
        }
        return (sum == og);
    }

    public static void divisors(int N){
        for (int i = 1; i*i <= N; i++) {
            if ( N % i == 0){
                System.out.print(i+" ");

                if( i != N/i){
                    System.out.println(N/i+" ");
                }
            }
        }
    }

    public static boolean prime(int p){
        if( p <= 1){
            return false;
        }
        for (int i = 2; i*i <= p; i++) {
            if(p % i == 0){
                return false;
            }
        }
        return true;
    }
}
