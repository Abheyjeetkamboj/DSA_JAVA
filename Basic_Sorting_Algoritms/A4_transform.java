package Basic_Sorting_Algoritms;

public class A4_transform {
        public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {97,58,29,68,107};
        print(arr);
    int sum = 0;

    for(int a = 0;a<arr.length;a++){
    int min = Integer.MAX_VALUE;
    int hello =-1;
    for(int i = 0;i<arr.length;i++){
        if(min>arr[i]&&arr[i]>0){
        min = arr[i];
        hello = i;
        
    }
}
    arr[hello] = sum;
    sum--;
    }

    print(arr);

        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]*(-1)+" ");
        }
        System.out.println();
    }
    
}
