package BinarySearch;

public class A1_Search_element {
    public static void main(String[] args) {
        int[] arr = {4,6,9,11,13,16,19};
        int key = 16;
        boolean flag = true;
        int start= 0,end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==key){
                flag = false;
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<key){
                start= mid+1;

            }
            else {
                end = mid-1;
            }
        }
        if(flag) System.out.println("Not Found");

    }   
}
