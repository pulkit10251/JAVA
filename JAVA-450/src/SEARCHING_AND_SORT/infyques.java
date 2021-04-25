package SEARCHING_AND_SORT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class infyques {


    public static void main(String[] args) {
        List<String>  li = new ArrayList<>() ;

        li.add("My");
        li.add("name");
        li.add("is");
        li.add("pulkit");

        Iterator<String> iter = li.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next().toString() + " ");
        }
    }
}
