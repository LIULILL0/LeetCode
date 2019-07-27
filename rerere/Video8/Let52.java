package rerere.Video8;

public class Let52 {
    int res = 0;
    boolean[]col;
    boolean[]dia1;
    boolean[]dia2;
    public int totalNQueens(int n) {
        col = new boolean[n];
        dia1 = new boolean[2*n-1];
        dia2 = new boolean[2*n-1];

        dfs(n,0);
        return res;
    }
    public void dfs(int n,int index ){
        if(index==n){
            res++;
            return;
        }

        for(int i=0;i<n;i++){
            if(!col[i] && !dia1[index+i] && !dia2[index - i + n-1]){
                col[i] = true;
                dia1[index+i] = true;
                dia2[index - i+n-1] = true;

                dfs(n,index+1);

                col[i] = false;
                dia1[index+i] = false;
                dia2[index - i +n-1] = false;

            }
        }
        return ;
    }
}
