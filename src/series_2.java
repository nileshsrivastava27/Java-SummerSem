import java.util.Scanner;
public class series_2 {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=6;


        for (int i = 5; i <= n; i = i + 5) {
            System.out.println(x+i);
            x=x+i;

        }


    }

}
