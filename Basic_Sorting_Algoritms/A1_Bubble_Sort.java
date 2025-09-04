package Basic_Sorting_Algoritms;

public class A1_Bubble_Sort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,7,0,-1,-8,21,5,8};
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j= 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);

        }
}
