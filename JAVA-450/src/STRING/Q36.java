package STRING;

import java.util.*;

public class Q36 {

    public static void main(String[] args) {
        String[] arr_list = {"dog", "god", "cat", "tac", "act"};
        List<List<String>> list =Anagrams(arr_list);

    }

    public static List<List<String>> Anagrams(String[] string_list){
        HashMap<String ,List<String>> map = new HashMap<>();

        for (int i = 0; i < string_list.length ; i++) {
            String word = string_list[i];

            char[] letters = word.toCharArray();
            Arrays.sort(letters);

            String newWord = new String(letters);

            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            }else{
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        List<List<String>> list  = new ArrayList<>();

        for(Map.Entry<String, List<String>> val : map.entrySet()){
            list.add(val.getValue());
        }

        return list;
    }
}
