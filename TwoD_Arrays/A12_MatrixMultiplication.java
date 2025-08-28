package TwoD_Arrays;
public class A12_MatrixMultiplication {
    public static void print(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        
        
        int[][] product = new int[arr[0].length][arr1.length];
        for(int i = 0;i<product.length;i++){
            for(int j = 0;j<product[0].length;j++){
                int sum = 0;
                for(int k = 0;k<arr1.length;k++){
                    sum += arr[i][k]*arr1[k][j];
                }
                product[i][j] = sum;
            }
        }
        print(product);
    }
}
