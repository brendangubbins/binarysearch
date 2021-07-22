import java.util.*;

class Solution {
    public int[] solve(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length || j < b.length) {
            if (i == a.length) {
                list.add(b[j++]);
            } 
            else if (j == b.length) {
                list.add(a[i++]);
            }
            else {
                list.add(a[i] > b[j] ? b[j++] : a[i++]);
            }
        }
        int ans[] = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
