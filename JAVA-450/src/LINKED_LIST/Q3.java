package LINKED_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q3 {

    public static void main(String[] args) {
            // Ques done in gfg
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
