import java.sql.SQLOutput;
import java.util.Scanner;

public class printstring {
    public static void main(String[] args) {
        int n;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to store:");
        n=sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }

        System.out.println("The elements are");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }

        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        System.out.println("The sum is "+sum);
    }
}
