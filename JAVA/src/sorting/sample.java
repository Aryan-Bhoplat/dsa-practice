package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class sample {
    public static void main(String[] args) {

        int[] arr = {5,3,2,1,4};
        selection(arr);

        arr = new int[]{5,3,2,1,4};
        bubble(arr);

        arr = new int[]{5,3,2,1,4};
        insertion(arr);

        arr = new int[]{5,3,2,1,4};
        ms(arr, 0, arr.length - 1);
        System.out.println("After Merge Sort: " + Arrays.toString(arr));

        arr = new int[]{5,3,2,1,4};
        qs(arr, 0, arr.length - 1);
        System.out.println("After Quick Sort: " + Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println("After Selection Sort: "+Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort: "+Arrays.toString(arr));
    }

//    static void insertion(int[] arr){
//        for (int i = 1; i < arr.length ; i++) {
//            int j = i;
//            while(j > 0 && arr[j-1] > arr[j]){
//                int temp = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//        System.out.println("After Insertion Sort: "+Arrays.toString(arr));
//    }
    static void insertion(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("After Insertion Sort: "+Arrays.toString(arr));
    }

    static void ms(int[] arr,int low, int high){
            if ( low >= high){
                return;
            }
            int mid = ( low + high)/2;
            ms(arr,low,mid);
            ms(arr,mid+1,high);
            merge(arr,low,mid,high);
    }
    static void merge(int[] arr, int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        
        int left = low;
        int right = mid + 1;
        
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left] );
            left++;
        }
        while(right <= high){
            temp.add(arr[right] );
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }

    static void qs(int[] arr, int low,int high){
        if (low < high){
            int pivotIndex = partition(arr,low,high);
            qs(arr,low,pivotIndex-1);
            qs(arr,pivotIndex+1,high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
