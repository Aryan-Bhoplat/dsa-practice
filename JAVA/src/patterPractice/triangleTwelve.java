package patterPractice;

public class triangleTwelve {
    public static void main(String[] args) {
        ex(4);
    }
    public static void ex(int n){
        for (int i = 0; i <=n; i++) {
            //first triangle
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 0; j < 2*n-(2*i); j++) {
                System.out.print(" ");
            }

            // second triangle
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }


            System.out.println();
        }
    }
}
