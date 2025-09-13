package BinarySearch;

public class A4_Search_in_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int key = -1;
        int start = 1;
        int find = 0;
        int end = arr.length-2;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                key = mid;
                break;

            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(key);

        start = 0;
        end = key;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==find){
                ans = mid;
                break;
            }
            else if(arr[mid]<find){
                end= mid-1;
            }
            else {
                start = mid+1;
            }
        }
        start = key+1;
        end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==find){
                ans = mid;
                break;
            }
            else if(arr[mid]>find){
                end= mid-1;
            }
            else {
                start = mid+1;
            }
        }
        System.out.println(ans);
    }
}
