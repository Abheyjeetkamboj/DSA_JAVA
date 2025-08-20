package TwoD_Arrays;

public class A10_Wave_Form {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int min_row = 0;
        int max_row = arr.length-1;
        int min_col = 0;
        int max_col = arr[0].length-1;
        
        while(min_col<=max_col&&min_row<=max_row){
           //blue
            for(int j = min_col;j<=max_col;j++){
                System.out.print(arr[min_row][j]+" ");
                
            }
            min_row++;
            
            //orange
            if(min_col>max_col||min_row>max_row) break;
            for(int k = min_row;k<=max_row;k++){
                System.out.print(arr[k][max_col]+" ");
            }
            max_col--;
            //red 
            if(min_col>max_col||min_row>max_row) break;
            for(int l = max_col;l>=min_col;l--){
                System.out.print(arr[max_row][l]+" ");
            }
            max_row--;
            //green
            if(min_col>max_col||min_row>max_row) break;
            for(int m =max_row;m>=min_row;m--){
                System.out.print(arr[m][min_col]+" ");
            }
            min_col++;
            
        }
    }
}
