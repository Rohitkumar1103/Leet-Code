class Solution {
    int[][] moves = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    boolean[][] vis;
    int num;
    public int regionsBySlashes(String[] grid) {
        num=0;
        int n = grid.length;
       String[][] mat = new String[3*n][3*n];
       vis = new boolean[3*n][3*n];
        for(int i=0;i<mat.length;i++)
            Arrays.fill(mat[i], " ");
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i].charAt(j)!=' ')
                    fill(i*3, j*3, mat, grid[i].charAt(j)=='/');
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(!vis[i][j] && mat[i][j].equals(" ")){
                    num++;
                    find(vis, i, j, mat);

                }

            }
        }

        return num;
       
    }
    public void find(boolean[][] vis, int x, int y, String[][] mat){

        vis[x][y]=true;
        for(int[] pos : moves){
            int newX = x+pos[0];
            int newY = y+pos[1];
            if(valid(newX, newY, mat) && !vis[newX][newY]){
                
                if(!mat[newX][newY].equals(" "))
                    continue;
                else
                    find(vis, x+pos[0], y+pos[1], mat);
            }
        }

    }
    public boolean valid(int x, int y, String[][] mat){
        return x>=0&&x<mat.length && y>=0&&y<mat[0].length;
    }
    public void fill(int x, int y, String[][] mat, boolean t){
        if(t){
            y+=2;
            mat[x][y]="/";
            mat[x+1][y-1]="/";
            mat[x+2][y-2]="/";
        }
        else{
            mat[x][y]="\\";
            mat[x+1][y+1]="\\";
            mat[x+2][y+2]="\\";
        }
    }
}