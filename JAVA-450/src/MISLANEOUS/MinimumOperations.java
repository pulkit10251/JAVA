package MISLANEOUS;

import java.util.TreeMap;
//import java.util.TreeMap;

public class MinimumOperations {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "fgggghfg";

        int op = findMinOper(str1, str2);
        System.out.println(op);
    }

    public static int findMinOper(String str1, String str2){
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();

        for(int i = 0; i < str1.length(); i ++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for(int i = 0; i < str2.length(); i ++){
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }


        System.out.println(map1);
        int res1 = getMin(str1, str2, map1, map2);
        int res2= getMin(str2, str1, map2, map1);

        char commonElement = 'a';
        int maxSum = 0;
        for(char ch : map1.keySet()){
            int sum1 = map1.getOrDefault(ch, 0);
            int sum2 = map2.getOrDefault(ch, 0);

            if(sum1 + sum2 > maxSum){
                maxSum = sum1 + sum2;
                commonElement = ch;
            }
        }

        for(char ch : map2.keySet()){
            int sum1 = map1.getOrDefault(ch, 0);
            int sum2 = map2.getOrDefault(ch, 0);

            if(sum1 + sum2 > maxSum){
                maxSum = sum1 + sum2;
                commonElement = ch;
            }
        }

        int res3 = str1.length() - map1.getOrDefault(commonElement, 0) + str2.length() - map2.getOrDefault(commonElement, 0);

        System.out.println(res1 + " " + res2+ " " + res3);
        return Math.min(res1, Math.min(res2, res3));
    }
    public static int getMin(String str1, String str2, TreeMap<Character,Integer> map1, TreeMap<Character,Integer> map2){
        Character lowestStr1 = map1.firstKey();
        Character lowestStr2 = map2.firstKey();
        Character highestStr1 = map1.lastKey();
        Character highestStr2 = map2.lastKey();
        int makestr1Min = 0;
        int makestr2Max = 0;
        if(lowestStr2 == 'a'){
            makestr1Min = Integer.MAX_VALUE;
        }else{
            for(char ch : map1.keySet()){
                if(ch  >=  lowestStr2){
                    makestr1Min+= map1.get(ch);
                }
            }
        }
        if(highestStr1 == 'z'){
            makestr2Max = Integer.MAX_VALUE;
        }else{
            for(char ch : map2.keySet()){
                if(ch <= highestStr1){
                    makestr2Max+= map2.get(ch);
                }
            }
        }
//        System.out.println(lowestStr1 + " " + lowestStr2 + " " + highestStr2 + " " + highestStr1);
//        System.out.println(makestr2Max + " " + makestr1Min);

        return Math.min(makestr2Max, makestr1Min);
    }
}
