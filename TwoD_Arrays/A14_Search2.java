public class A14_Search2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}
                    };
        int i = 0;
        int j  = arr[0].length-1;
        int target = 1;
        boolean flag = false;
        while(i<arr.length&&j>=0){
            if(arr[i][j]==target){
                flag =true;
                System.out.println("Found");
                break;
            }
            else if(arr[i][j]<target){
                i++;
            }
            else j--;
        }
        if(flag==false)
        System.out.println("Not Found");
    }
}