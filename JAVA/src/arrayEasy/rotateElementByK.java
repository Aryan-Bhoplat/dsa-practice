package arrayEasy;

import java.util.Arrays;

public class rotateElementByK {
    static void reverse(int[] arr,int start,int end){
        // For reversing the Array
        while ( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    static void rightRotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Initial: "+Arrays.toString(arr));
        leftRotate(arr,3);
        System.out.println("Left Rotate: "+Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rightRotate(arr,2);
        System.out.println("Left Rotate: "+Arrays.toString(arr));


    }
}
