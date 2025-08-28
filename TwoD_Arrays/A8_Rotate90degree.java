package TwoD_Arrays;

public class A8_Rotate90Degree {
    public static void print(int arr[][]){
        int m = arr.length;
        int n =  arr[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        int [][] arr1 = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr1[i][j] = arr[j][i];
            }
        }
        print(arr1);
        System.out.println();
        rotate(arr1);
        System.out.println();
        print(arr1);
    }   
}
