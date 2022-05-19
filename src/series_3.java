import java.util.Scanner;

public class series_3 {
    public static void main(String[] args) {
        double n=0.5;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=1;i<=x;i++){
            System.out.print(n+",");
            n=n*3;

        }
    }
}

