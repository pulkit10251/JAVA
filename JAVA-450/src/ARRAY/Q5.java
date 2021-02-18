package ARRAY;

import java.util.LinkedList;

public class Q5 {

    public static void main(String[] args) {
        //Ques 5 : Move all negative no. to one side of array
        int[] A = {-1,5,6,7,8,2,-6,-5,-45,-35,43,-7,65,55,48,12,-10};
        LinkedList<Integer> li = new LinkedList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if(A[i]<0){
                li.addLast(A[i]);
            }else{
                li.addFirst(A[i]);
            }
        }

        for (int i = 0; i <A.length ; i++) {
            System.out.print(li.get(i)+" ");
        }

    }
}
