import java.util.Scanner;

public class test_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch (grade)
        {
            case 'S':
                System.out.println("Marks is between 91-100");
                break;

            case 'A':
                System.out.println("Marks is between 81-90");
                break;

            case 'B':
                System.out.println("Marks is between 71-80");
                break;

            case 'C':
                System.out.println("Marks is between 61-70");
                break;

            case 'D':
                System.out.println("Marks is between 51-60");
                break;

            case 'E':
                System.out.println("Marks is between 41-50");
                break;

            default:
                System.out.println("Invalid grade");
                break;
        }


    }
}
