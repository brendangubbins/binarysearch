class Solution:
    def solve(self, tasks, people):

        if len(tasks) == 0:
            return 0

        tasks.sort()
        people.sort()
        ans = 0
        j = 0

        for i in range(0, len(people)):
            if j >= len(tasks):
                break
            if people[i] >= tasks[j]:
                ans += 1
                j += 1
                
        return ans 
        