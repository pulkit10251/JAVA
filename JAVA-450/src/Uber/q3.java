package Uber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q3 {
    static ArrayList<Long> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
//        int n = 7458;
        long ans = 0;
        findAllSuperLucky(4,1,0);
        findAllSuperLucky(7,0,1);
//        System.out.println(list.size());
        Collections.sort(list);
//        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) >= n){
                ans = list.get(i);
                break;
            }
        }

        System.out.println(ans);
    }

    public static void findAllSuperLucky(long number, int fours, int sevens){
        if(number > 1e10)
            return;
        if(fours == sevens)
            list.add(number);

        findAllSuperLucky(number * 10 + 7, fours, sevens + 1);
        findAllSuperLucky(number * 10 + 4, fours + 1, sevens);
    }
}
