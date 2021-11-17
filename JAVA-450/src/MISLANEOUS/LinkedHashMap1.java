package MISLANEOUS;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(2){

        };
        ArrayList<Integer> list = new ArrayList<>(){
            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return super.subList(fromIndex, toIndex);
            }
        };
        map.put(5, 5);
        map.put(2, 6);
        map.put(5, 9);

        System.out.println(map.toString());
    }
}
