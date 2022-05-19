//Swap two nibbles in a byte
//
//1. X have in binary. The operation can split in mainly two parts.
//2. The expression "x&0x0F" gives last 4 digits bitis of x.
//3. Using bitwise operator '<<' shift last 4 bits to the left 4 times.
//4. The expresion "x&0xF0" first 4 digits of x.
//5.USing bitwise operator '>> ' shift the 4 bits to hte right 4 times.
//6. Use bitwise (OR) '|' operation of two expressions.


import java.util.Scanner;
public class swap_nibbles {
    static int swap_nibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);

    }


    // Driver code
    public static void main(String arg[])
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be swapped:");
        x=sc.nextInt();
        System.out.println("Swapped value is:" +swap_nibbles(x));
        System.out.println("The binary value of integer is:"+ Integer.toBinaryString(x));
    }
}
