class Solution {
    solve(n) {
        let arr = [];
        for (let i = 2; i <= n; i++) {
            arr.push(i);
            for (let j = 2; j < i; j++) {
                if (i % j === 0) {
                    arr.pop();
                    break;
                }
            }
        }
        return arr;
    }
}