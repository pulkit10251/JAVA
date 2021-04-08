package STRING;

import javax.net.ssl.SSLEngineResult;
import java.util.HashMap;

public class Q40 {

    public static void main(String[] args) {
        System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ"));
        System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE"));
        System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE"));
        System.out.println(runCustomerSimulation(1, "ABCBCA"));
        System.out.println(runCustomerSimulation(1, "ABCBCADEED"));
    }

    public static int runCustomerSimulation(int n, String str){
        char[] seq = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < seq.length; i++){
            map.put(seq[i],0);
        }


        int count = 0;
        int noc = n;
        for(int i =0 ;i< seq.length; i++){

            if(noc == -1){
                count++;
            }

            map.put(seq[i], map.get(seq[i])+1);
            if(map.get(seq[i]) == 1){
                noc--;
            }else if(map.get(seq[i])==2){
                noc++;
            }
        }

        return count;
    }
}
