package BinarySearch;

public class A2_Lower_Bound {
    public static void main(String[] args) {
            int[] arr={10,20,30,30,40,50,60,70,80,90};
            int key = 35 ;
            int start = 0,end= arr.length-1;
            int lb = arr.length;
            while(start<=end){
                int mid = start+(end-start)/2;
                
                
                if(arr[mid]>=key){
                    lb= mid;
                    end = mid-1;
                }
                else {
                    start = mid+1;
                    
                }
            }
            System.out.println(lb);
        }
}
