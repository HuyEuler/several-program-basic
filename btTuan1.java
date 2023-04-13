import java.util.Scanner;
import java.lang.Math;

class btTuan1{
    static int current = 1;
    static final int MAX = 30; 

    static void print(int[][] a,int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.printf("%-3d",a[i][j]);
            }
            System.out.printf("\n");
        }
    }

    static void draw_line(int[][] a,int m, int n){
        int i;
        for(i = m; i <= n-m+1; i++){
            a[m][i] = current++;
        }
        current--;
        
        for(i = m; i <= n-m+1; i++){
            a[i][n-m+1] = current++;
        }
        current--;
    
        for(i = n-m+1; i >= m; i--){
            a[n-m+1][i] = current++;
        }
        current--;
        
        for(i = n-m+1; i >= m+1; i--){
            a[i][m] = current++;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] a = new int[MAX][MAX];

        int k = (int) Math.ceil((n+1)*1.0/2);
        for(int i = 1; i <= k; i++){
            draw_line(a,i,n);
        }
        print(a,n);

        input.close();
    }
}