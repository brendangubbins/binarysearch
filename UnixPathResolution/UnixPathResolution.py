class Solution:
    def solve(self, path):
        ans = []
        for i in range(len(path)):
            if path[i] == "..":
                if len(ans) > 0:
                    ans.pop()
            elif path[i] == ".":
                continue
            else:
                ans.append(path[i])
        return ans