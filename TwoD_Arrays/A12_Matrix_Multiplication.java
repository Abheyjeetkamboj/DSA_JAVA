package TwoD_Arrays;


public class A12_Matrix_Multiplication {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,2,1},{1,0,1},{1,2,3}};
        int[][] c = new int[a[0].length][b.length];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                int sum = 0;
                for(int k = 0;k<b.length;k++){
                    sum += a[i][k]*b[k][i];
                    c[i][k] = sum;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            for(int j= 0;j<a.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
