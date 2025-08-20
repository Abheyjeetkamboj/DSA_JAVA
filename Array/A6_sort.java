package Array;

public class A6_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,8,2};
        // int[] arr1={2,45,1,3,7,5};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
