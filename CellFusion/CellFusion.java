import java.util.*;

class Solution {
    public int solve(int[] cells) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int cell : cells) {
            heap.add(cell);
        }
        while (heap.size() > 1) {
            int a = heap.remove();
            int b = heap.remove();
            if (a == b) {
                continue;
            }
            else {
                heap.add((a + b) / 3);
            }
        }
        return heap.size() > 0 ? heap.peek() : -1;
    }
}
