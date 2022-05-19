import java.util.Scanner;

class segmented_sieve_algo {
    void segmented_sieve_algo(int n, int m)
    {
        int x;
        x=m-n;
        boolean prime[] = new boolean[m+1];
        for (int i = n; i <= m; i++)
            prime[i] = true;

        for (int p = n; p * p <= m; p++) {

            if (prime[p] == true) {

                for (int i = p * p; i <= m; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = n; i < m; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }

    public static void main(String args[])
    {
        int n = 0;
        int m=0;
        segmented_sieve_algo g = new segmented_sieve_algo();
        System.out.println("Enter start number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter end number:");
        m=sc.nextInt();
        g.segmented_sieve_algo(n,m);

    }
}


//import java.util.Vector;
//import static java.lang.Math.sqrt;
//import static java.lang.Math.floor;
//public class segmented_sieve_algo{
//    static void simpleSieve(int limit, Vector<Integer> prime){
//        boolean mark[] = new boolean[limit+1];
//
//        for (int i = 0; i < mark.length; i++)
//            mark[i] = true;
//        for (int p=2; p*p<limit; p++){
//            if (mark[p] == true){
//                for (int i=p*p; i<limit; i+=p)
//                    mark[i] = false;
//            }
//        }
//        for (int p=2; p<limit; p++)
//        {
//            if (mark[p] == true)
//            {
//                prime.add(p);
//                System.out.print(p + "  ");
//            }
//        }
//    }
//    static void segmentedSieve(int n){
//        int limit = (int) (floor(sqrt(n))+1);
//        Vector<Integer> prime = new Vector<>();
//        simpleSieve(limit, prime);
//        int low  = limit;
//        int high = 2*limit;
//        while (low < n) {
//            if (high >= n)
//                high = n;
//            boolean mark[] = new boolean[limit + 1];
//
//            for (int i = 0; i < mark.length; i++)
//                mark[i] = true;
//            for (int i = 0; i < prime.size(); i++) {
//                int loLim = (int) (floor(low / prime.get(i)) * prime.get(i));
//                if (loLim < low)
//                    loLim += prime.get(i);
//                for (int j = loLim; j < high; j += prime.get(i))
//                    mark[j - low] = false;
//            }
//            for (int i = low; i < high; i++)
//                if (mark[i - low] == true)
//                    System.out.print(i + "  ");
//            low = low + limit;
//            high = high + limit;
//        }
//
//    }
//    public static void main(String[] args) {
//        int n = 100;
//        System.out.println("Primes smaller than " + n + ":");
//        segmentedSieve(n);
//    }
//
//
//
//}