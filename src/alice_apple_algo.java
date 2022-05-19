//N-Grows only green apples
//S-Grows only red apples
//E-Some green apples
//W-Some red apples
//Approach:  Every apple in the south ensures that it is red. So first, take an apple from the south. In the East and West,
// there is at least 1 red apple in each tree. That’s why, for guaranteed it is considered that there is only 1 red apple on each tree in east and west.
// For the north there is no red apple, so, neglect that. Follow the steps below to solve the problem:
//
//        If M is less than equal to S*K then print M.
//        Else if M is less than equal to S*K+E+W then print S*K + (M-S*K) * K
//        Else print -1.



import java.util.Scanner;
public class alice_apple_algo {

        static int minApples(int M,int K,int N,int S,int W,int E)
        {

            if(M <= S * K)
                return M;


            else if(M <= S * K + E + W)
                return S * K + (M-S * K) * K;

                // If we doesn't have enough
                // red apples
            else
                return -1;
        }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("No. of red apple for gift");
        int M=sc.nextInt();
        System.out.println("No. of red apple in each tree");
        int K =sc.nextInt();
        System.out.println("No. of tree in North");
        int N = sc.nextInt();
        System.out.println("No. of tree in South");
        int S = sc.nextInt();
        System.out.println("No. of tree in West");
        int W = sc.nextInt();
        System.out.println("No. of tree in East");
        int E = sc.nextInt();

        int result = minApples(M,K,N,S,W,E);
        System.out.println(result);

    }
}
