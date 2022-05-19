import java.util.Scanner;

public class series_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            System.out.print(i*i+",");
        }
    }
}
