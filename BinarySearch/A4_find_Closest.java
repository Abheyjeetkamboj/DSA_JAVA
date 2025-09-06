package BinarySearch;
import java.util.*;

public class A4_find_Closest {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        if (x < arr[0]) {
            for (int i = 0; i < k; i++) ans.add(arr[i]);
            return ans;
        }
        if (x > arr[n - 1]) {
            for (int i = n - 1; i >= n - k; i--) ans.add(arr[i]);
            Collections.sort(ans);
            return ans;
        }

        int start = 0, end = n - 1, lb = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x) {
                lb = mid;
                end = mid - 1;
            } else start = mid + 1;
        }

        int i = lb - 1, j = lb;
        while (k > 0 && i >= 0 && j < n) {
            int li = Math.abs(x - arr[i]);
            int lj = Math.abs(x - arr[j]);
            if (li <= lj) {
                ans.add(arr[i]);
                i--;
            } else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }

        while (i >= 0 && k > 0) {
            ans.add(arr[i]);
            i--;
            k--;
        }
        while (j < n && k > 0) {
            ans.add(arr[j]);
            j++;
            k--;
        }

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        List<Integer> result = findClosestElements(arr, k, x);

        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

