import java.util.*;
public class weighted_substring {
    static int substring(String P, String Q, int K, int N ){
        HashSet<String> S = new HashSet<String>();
        for (int i = 0; i<N; ++i){
            int sum = 0;
            String s = " ";
            for (int j = i ; j<N; ++j){
                int pos = P.charAt(j)-'a';
                sum += Q.charAt(pos)-'0';
                s += P.charAt(j);
                if (sum<=K){
                    S.add(s);

                }
                else{
                    break;
                }


            }
        }
        return S.size();
    }

    public static void main (String[] args){
        String P = "nilesh";
        String Q = "12300045600078900012345";
        int K = 6;
        int N = P.length();
        System.out.println(substring(P,Q,K,N));


    }

}