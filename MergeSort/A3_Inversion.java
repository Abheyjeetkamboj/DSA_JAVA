package MergeSort;

public class A3_Inversion {
    static int count;
    // public static void inversion(int[]a,int[]b){
    //     int i = 0;
    //     int j = 0;
    //     while(i<a.length&&j<b.length){
    //         if(a[i]>b[j]){
    //             count += a.length-i;
    //             j++;
    //         }
    //         else i++;
    //     }
        
    // }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] arr,int[] arr1,int[] ans){
        int i = 0,j=0,k=0;
        while(i<arr.length&&j<arr1.length){
            if(arr[i]<arr1[j]){
                ans[k] = arr[i];
                k++;
                i++;
                        }

            else{
                count += arr.length-i;
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

    public static void mergesort(int[] arr){
      
        int n = arr.length;
        if (n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i = 0;i<a.length;i++){
            a[i] = arr[i];

        }
        for(int i = 0;i<b.length;i++){
            b[i] = arr[i+n/2];

        }


    
        mergesort(a);
        mergesort(b);
        // inversion(a,b);
        merge(a, b, arr);
        
    
    }

    public static void main(String[] args) {
        int arr[] = {80,10,20,30,50,90,60,40,70};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
