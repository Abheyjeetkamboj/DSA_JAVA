package Strings;

public class A21_Most_Occurence {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abheyjeet");
        int[] arr = new int[26];
        int ans = 0;
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            ans =  ch-'a';
            arr[ans]++;
        }
        int min = -1;
        char answ = 'a';
        for(int i = 0;i<26;i++){
            if(min<arr[i]){
                min = arr[i];
                answ = (char) (i + 'a');

            }
        }
        System.out.print(answ+" ");
        System.out.print(min);
    }
}
