package BinarySearch;

import java.util.Arrays;

public class A5_Agressive_cows {
    public static boolean ispossible(int[] arr,int mid,int k){
        int start = arr[0];
        int count = 1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]-start>=mid){
                count++;
                start = arr[i];
                if(count==k) return true;
            }
        }
        
        return false;
    }
    public static int aggressiveCows(int []arr, int k) {
       int n = arr.length;
       Arrays.sort(arr);
       int start = 1;
       int end = arr[n-1]-arr[0];
       int ans = 0;
       while(start<=end){
           int mid = start+(end-start)/2;
           if(ispossible(arr,mid,k)){
               ans = mid;
            start = mid+1;
           }
           else {
                end = mid-1;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        int []arr = {0,3,4,7,10,9};
        int cows = 4;
        System.out.println(aggressiveCows(arr, cows));
}
}