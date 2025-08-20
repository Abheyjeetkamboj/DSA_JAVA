package TwoD_Arrays;

public class A9_wawe_matrix {
        public static void print(int[][] arr){
        
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
           
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12 }};
        print(arr);
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                }
                
                else{
                    System.out.print(arr[i][n-1-j]+" ");
                }
                
            }
        }
       
    }
}
