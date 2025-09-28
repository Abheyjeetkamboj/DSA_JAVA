package MergeSort;



public class A1_MergeTwoArrays {
    public static void print(int[] arr,int[] arr1,int[] ans){
        int i = 0,j=0,k=0;
        while(i<arr.length&&j<arr1.length){
            if(arr[i]<arr1[j]){
                ans[k] = arr[i];
                k++;
                i++;
                        }

            else{
                ans[k] = arr1[j];
                j++;
                k++;
            }
        }
        while(j<arr1.length){
                ans[k] = arr1[j];
                j++;
                k++;
        }

        while(i<arr.length){
                ans[k] = arr[i];
                i++;
                k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,10,11,12};
        int[] arr1 = {2,4,6,9};
        int[] ans = new int[arr.length+arr1.length];
        print(arr, arr1, ans);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
