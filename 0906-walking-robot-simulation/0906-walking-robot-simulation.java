class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Set to store obstacles for quick lookup
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }
        
        // Initial position and direction
        int x = 0, y = 0;
        int direction = 0; // 0: north, 1: east, 2: south, 3: west
        int maxDistanceSquared = 0;
        
        // Arrays to represent direction changes
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        for (int command : commands) {
            if (command == -2) {
                // Turn left
                direction = (direction - 1 + 4) % 4;
            } else if (command == -1) {
                // Turn right
                direction = (direction + 1) % 4;
            } else {
                // Move forward
                for (int step = 0; step < command; step++) {
                    int newX = x + dx[direction];
                    int newY = y + dy[direction];
                    String pos = newX + "," + newY;
                    
                    if (obstacleSet.contains(pos)) {
                        // Obstacle encountered, stop moving
                        break;
                    }
                    
                    // Update position
                    x = newX;
                    y = newY;
                    
                    // Update max distance
                    maxDistanceSquared = Math.max(maxDistanceSquared, x*x + y*y);
                }
            }
        }
        
        return maxDistanceSquared;
    }
}