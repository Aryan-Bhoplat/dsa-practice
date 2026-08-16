package basicHashing;

import java.util.HashMap;

public class highestOccurrence {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 7, 5, 7, 8};

        HashMap<Integer,Integer> map = new HashMap<>();

        for ( int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        int ans = -1;

        for(int key: map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                ans = key;
            }
        }

        System.out.println("Answer: "+ans);
        System.out.println("Frequency: "+maxFreq);
    }
}
