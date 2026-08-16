package basicHashing;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,1,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }

        for( int k: map.keySet()){
            System.out.println(k+" -> "+ map.get(k));
        }
    }
}
