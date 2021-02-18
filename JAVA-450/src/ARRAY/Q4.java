package ARRAY;

public class Q4 {

    public static void main(String[] args) {
        // QUes 4: Sort array of 0,1,2
        int[] array = {0,1,1,2,1,2,0,1,0,2,1,0,2,0,1,2,2,1,0,0};
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==0){
                count0++;
            }else if(array[i]==1){
                count1++;
            }else{
                count2++;
            }
        }

        int i =0;
        while(count0>0){
            array[i++]=0;
            count0--;
        }
        while(count1>0){
            array[i++]=1;
            count1--;
        }
        while(count2>0){
            array[i++]=2;
            count2--;
        }
        System.out.println("Sorted Array : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }

    }
}
