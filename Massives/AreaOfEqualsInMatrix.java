package Massives;

public class AreaOfEqualsInMatrix {

    static boolean [][] visited=new boolean[1000][1000];
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    public static void main(String []args){
        int count=0;
        int max=0;
        int[][] matrix = {{1, 3, 2, 2, 2, 4},
                {3, 3, 3, 2, 4, 4},
                {4, 3, 1, 2, 3, 3},
                {4, 3, 1, 3, 3, 1},
                {4, 3, 3, 3, 1, 1}};
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (visited[i][j]==false) {
                    count = dfs(matrix,i,j,matrix[i][j]);
                    if (count>max) {
                        max=count;
                    }
                }
            }
        }
        System.out.println(max);
    }
    static int dfs(int[][] matrix,int x, int y,int value){
        if (visited[x][y]==true){
            return 0;
        }
        else{
            visited[x][y]=true;
            int best=0;
            for (int i = 0; i <4 ; i++) {
                int modX=dx[i]+x;
                int modY=dy[i]+y;
                if (modX==-1 || modX>=matrix.length|| modY==-1|| modY>=matrix[x].length){
                    continue;
                }
                if (matrix[modX][modY]==value){
                    int v=dfs(matrix,modX,modY,value);
                    best+=v;
                }
            }
            return best+1;
        }
    }
}
