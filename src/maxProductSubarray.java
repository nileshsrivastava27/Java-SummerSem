import java.util.*;

public class maxProductSubarray {

    public static int macProduce(ArrayList<Integer> arr) {
        int prod = 1, i, max = Integer.MIN_VALUE, length = arr.size();

        for (i = 0; i < length; i++) {

            if ((arr.get(i) == 0)) {
                if (max < prod)
                    max = prod;
                prod = 1;
            } else if (i == length - 1) {
                prod = prod * arr.get(i);
                if (max < prod)
                    max = prod;
            } else {
                prod = prod * arr.get(i);
            }
        }
        return max;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        System.out.println("Enter the values of the arrray");

        ArrayList<Integer> store = new ArrayList<>();

        for (int i = 0; i < l; i++)
        {
            int temp = sc.nextInt();
            store.add(temp);
        }

        sc.close();

        System.out.println("Max product = " + macProduce(store));

    }
}