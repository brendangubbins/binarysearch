class Solution:
    def solve(self, sentence):
        delim = " "
        sentence = sentence.split()
        sentence.reverse()
        return delim.join(sentence)