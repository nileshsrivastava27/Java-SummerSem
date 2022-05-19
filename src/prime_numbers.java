import java.util.Scanner;
public class prime_numbers {
    public static void main(String[] args) {

        int flag =0;
        int n;
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n==1 ||n==0){
            System.out.println("Number is not a prime number");
        }

        for(int i=2;i<=n;i++)
        {
            if(n%i==0){
                flag=0;
                break;
            }
            else
            {
                flag=1;
            }

        }

        if(flag==0){
            System.out.println("Number is not a prime number");
        }
        else{
            System.out.println("Number is a prime number");
        }

    }
}
