package Uber;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class brokenKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            System.out.println(brokenKeys(arr[i]));
        }
    }
    public static String brokenKeys(String str){
        if(str.length() == 1){
            return str;
        }
        TreeSet<Character> set = new TreeSet<>();
        int i = 0;
        for(i = 0;i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                i++;
            }else {
                set.add(str.charAt(i));
            }
        }
//        System.out.println(i);
        if(i < str.length())
            set.add(str.charAt(str.length()-1));

        String res = "";
        for(char ch : set){
            res = res + ch;
        }

        return res;
    }
}
