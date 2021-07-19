import java.util.*;

class Solution {
    public boolean solve(int num) {
        int length = Integer.toString(num).length();
        int arr[] = new int[length];
        int index = length - 1;
        while (num > 0) {
            arr[index--] = num % 10;
            num /= 10;
        }
        index = length - 1;
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != arr[index--])
                return false;
        }
        return true;
    }
}
