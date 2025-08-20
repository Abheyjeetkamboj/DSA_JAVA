package Array;

public class A8_Maximum {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,8,3,8,-11,-82,100};
        int ans = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(ans<arr[i]) ans = arr[i];
        }
        System.out.println(ans);
    }
}
