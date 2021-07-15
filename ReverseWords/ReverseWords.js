class Solution {
  solve(sentence) {
    const answer = sentence.split(" ").reverse().join(" ");
    return answer;
  }
}
