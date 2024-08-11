import java.util.*;

class Solution {
    public int finalPositionOfSnake(int n, List<String> c) {
        int[][] v = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                v[i][j] = (i * n) + j;
            }
        }
        
        int x = 0, y = 0;
        int k = c.size();
        
        for (int i = 0; i < k; i++) {
            String direction = c.get(i);
            if (direction.equals("UP")) {
                x -= 1;
            } else if (direction.equals("RIGHT")) {
                y += 1;
            } else if (direction.equals("DOWN")) {
                x += 1;
            } else if (direction.equals("LEFT")) {
                y -= 1;
            }
        }
        
        return v[x][y];
    }
}
