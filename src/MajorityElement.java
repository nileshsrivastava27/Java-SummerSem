//import java.util.Scanner;
//
//public class MajorityElement {
//    public static void main(String[] args) {
//        System.out.println("Enter the number of elements to store: ");
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println("Enter the array: ");
//        int[] arr = new int[n];
//
//        for(int i=0;i<=n;i++){
//            arr[i]= sc.nextInt();
//        }
//        int count=0;
//        for(int p=0;p<=n;p++){
//
//        }
//
//
//    }
//}



import java.io.*;

class MajorityElement {

    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    public static void main(String[] args)
    {

        int arr[] = { 1, 1, 2,2,1,2,3,2,1};
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }
}


