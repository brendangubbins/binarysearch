import java.util.*;

class Solution {
    public boolean solve(String[] moves, int x, int y) {
        int resultantX = 0;
        int resultantY = 0;
        for (int i = 0; i < moves.length; i++) {
            if (moves[i].equals("NORTH"))
                resultantY++;
            else if (moves[i].equals("SOUTH"))
                resultantY--;
            else if (moves[i].equals("WEST"))
                resultantX--;
            else
                resultantX++;
        }
        return x == resultantX && y == resultantY;
    }
}