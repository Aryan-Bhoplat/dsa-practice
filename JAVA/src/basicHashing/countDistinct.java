package basicHashing;

import java.util.HashMap;

public class countDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 5};

        HashMap<Integer,Integer>  map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

//        int count = 0;
//
//        for(int i: map.keySet()){
//            count++;
//        }
        System.out.println("Distinct Numbers: "+map.size());
    }
}
