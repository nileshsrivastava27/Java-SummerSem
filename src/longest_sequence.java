//Longest Sequence of 1's' in binary representation with one flip
//1. The bits in the binary representation of the given number
//2. Keep track of the current 1's sequence length
//3. If 0, update the previous length
//4. If the next bit is a 1, the previous length should lenght should be set to the current length
//5. If the next bit is a 0, then can't merge these sequence, set previous length is 0
//6. the current value of max length
//7. current length +previous length
//8. Result = return max-length +1


import java.util.Scanner;

class GFG
{

    static int flipBit(int a)
    {
		/* If all bits are l, binary representation
		of 'a' has all 1s */
        if (~a == 0)
        {
            return 8 * sizeof();
        }

        int currLen = 0, prevLen = 0, maxLen = 0;
        while (a != 0)
        {
            // If Current bit is a 1
            // then increment currLen++
            if ((a & 1) == 1)
            {
                currLen++;
            }

            // If Current bit is a 0 then
            // check next bit of a
            else if ((a & 1) == 0)
            {
				/* Update prevLen to 0 (if next bit is 0)
				or currLen (if next bit is 1). */
                prevLen = (a & 2) == 0 ? 0 : currLen;

                // If two consecutively bits are 0
                // then currLen also will be 0.
                currLen = 0;
            }

            // Update maxLen if required
            maxLen = Math.max(prevLen + currLen, maxLen);

            // Remove last bit (Right shift)
            a >>= 1;
        }

        // We can always have a sequence of
        // at least one 1, this is flipped bit
        return maxLen + 1;
    }

    static byte sizeof()
    {
        byte sizeOfInteger = 8;
        return sizeOfInteger;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be fllipped:");
        x=sc.nextInt();
        System.out.println("The flipped answer is : "+flipBit(x));
    }
}


