package Recursion;

public class A8_Array_traversal {
    public static void print(int i,int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,7,3,8,2,6};
        print(0,arr);
    }
}
