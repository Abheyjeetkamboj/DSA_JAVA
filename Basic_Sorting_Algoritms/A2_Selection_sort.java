package Basic_Sorting_Algoritms;

public class A2_Selection_sort {
        public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,7,0,-1,-8,21,5,8};
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j = i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        print(arr);
    }
}
