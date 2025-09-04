package Basic_Sorting_Algoritms;

public class A3_Insertion_sort {
        public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,2,10,1,7,4,3,8,6,5};
        for(int  i = 1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
 
        }
        print(arr);
    }   
}
