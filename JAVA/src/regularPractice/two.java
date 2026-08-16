package regularPractice;

public class two {
    public static void main(String[] args) {
        recOne(3);
        recTwo(5);
        System.out.println();
        recThree(5);
        System.out.println();
        System.out.println(recFour(10));
        System.out.println(recFive(5));
        func();
        System.out.println(recSeven("ABCBAD"));
        System.out.println(recEight("ABCBA",0));
        recNine(0);
    }
    public static void recOne(int n){
        if (n == 0){
            return;
        }
        System.out.println("Chamoi");
        recOne(n - 1);
    }

    public static void recTwo(int n){
        if (n == 0){
            return;
        }
        recTwo(n - 1);
        System.out.print(n+" ");
    }

    public static void recThree(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
        recThree(n - 1);
    }

    public static int  recFour(int n){
        if (n == 1){
            return 1;
        }
        return n+recFour(n-1);

    }

    public static int recFive(int n){
        if( n == 0){
            return 1;
        }
        return n * recFive(n-1);
    }

    public static void recSix(int[] arr,int x,int y){
        if (x >= y){
            return;
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

        recSix(arr,x+1,y-1);
    }

    public static void func(){
        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        recSix(arr,0,arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static boolean recSeven(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean recEight(String str,int i){
        int len = str.length()-1;
        if (i >= len/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(len-i)){
            return false;
        }

        return recEight(str,i+1);
    }

    public static void recNine(int n){
        if(n<0){return;}
        if( n == 0) {
            System.out.println(0);
            return;
        }
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }


        for(int k: fib){
            System.out.print(k+" ");
        }
    }
}

