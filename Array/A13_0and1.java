package Array;

public class A13_0and1 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,1,0,0,1,0,1};
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=1){
                int temp = arr[i];
                arr[i] = arr[result];
                arr[result] = temp;
                result++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
