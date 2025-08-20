package Array;

public class A14_find_next_greatest {
    public static int greatest(int start,int[] arr){
        int sum = arr[start];
        if(start==arr.length-1){
            sum = arr[start];
        }
        for(int i = start ;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(sum<arr[j]){
                     sum = arr[j];
        
                }
                
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,5,3,25,26,2,8,19,6};
        for(int i  = 0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i  = 0;i<arr.length;i++){
            
            System.out.print(greatest(i, arr)+" ");
        }

    }
}
