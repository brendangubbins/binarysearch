import java.util.*;

class Solution {
    public int solve(String s0, String s1) {
        HashSet<String> set = new HashSet<>();

        String[] arr1 = s0.split(" ");
        String[] arr2 = s1.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i].toLowerCase());
        }
        
        int count = 0;

        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j].toLowerCase())) {
                set.remove(arr2[j].toLowerCase());
                count++;
            }
        }

        if (s0.length() == 0) {
          return 0;
        }
        else {
          return count;
        }

    }
}
