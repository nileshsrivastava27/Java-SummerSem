//
import java.util.Scanner;
//
//
//public class siere_algo {
//    public static void main(String[] args) {
//        int n;
//
//
//        System.out.println("Enter any number:");
//        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
//
//        boolean [] a = new boolean[n+1];
//
//        for (int i = 0; i <= n; i++)
//        { a[i] = true;}
//
//
//        for(int p = 0; p * p <= n; p++){
//           if(a[p]==true){
//
//               for(int i = p*p;i<=n;i=i+p){
//                a[i]=false;
//               }
//           }
//
//
//           for(int i=2;i<=n;i++){
//               if(a[i]==true){
//                   System.out.print(i+" ");
//               }
//           }
////
////    }
//
//    }
//}



class sieve_algo {
    void sieve_algo(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {

            if (prime[p] == true) {

                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }

    public static void main(String args[])
    {
        int n = 0;
        sieve_algo g = new sieve_algo();
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        g.sieve_algo(n);
    }
}




