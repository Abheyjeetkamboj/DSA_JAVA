package Array;
public class A4_sort {
    public static void sorting(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }  
            }
            
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    public static void main(String[] args) {
    int[] arr = {5,6,7,3,1,0,2,6,8,9,5};
    // Arrays.sort(arr); //builtin function
    for(int ele:arr){
        System.out.print(ele+" ");
    }
    System.out.println();
    sorting(arr);
}

}
