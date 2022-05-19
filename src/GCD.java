import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        int gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int x= sc.nextInt();
        System.out.println("Enter second value:");
        int y = sc.nextInt();

        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0 && y%i==0){
                gcd = i;
                System.out.println(i);
        }
        }

        System.out.println("GCD of "+x+" and "+y+" is "+gcd);
    }
    
}
