import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sarr = arr.clone();   // Copy original array
        Arrays.sort(sarr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i < sarr.length; i++) {
            if (!map.containsKey(sarr[i])) {
                map.put(sarr[i], count);
                count++;
            }
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}