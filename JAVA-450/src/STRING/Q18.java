package STRING;

public class Q18 {

    public final static int d = 256;
    public static void main(String[] args) {
        String Text = "Pul se Pulli tu h kulli uliuli";
        String Pattern = "ull";

        RabinKarpAlgo(Text, Pattern, 101);
    }

    public static void RabinKarpAlgo(String Text, String Pattern, int q){

        int M = Pattern.length();
        int N = Text.length();

        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;


        for (i = 0; i < M-1; i++)
            h = (h*d)%q;

        System.out.println(h);

        for (i = 0; i < M; i++)
        {
            p += (Pattern.charAt(i) * (int)Math.pow(d,M-1-i));
            t += (Text.charAt(i) * (int)Math.pow(d,M-1-i));
        }


        p = p%q;
        t = t%q;
        System.out.println(p +"   "+t);

        for(i = 0; i <=N-M; i++){
            if(p == t){
                for(j = 0; j < M;j++){
                    if(Text.charAt(i+j) != Pattern.charAt(j)){
                        break;
                    }
                }

                if(j == M){
                    System.out.println("Pattern Found at index : "+ i);
                }
            }

            if( i < N-M){
                t = (d*(t - Text.charAt(i)*h) + Text.charAt(i+M))%q;

                if(t < 0){
                    t = t+q;
                }
            }
        }


    }
}
