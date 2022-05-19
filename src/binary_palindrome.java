//
//Binary palindrome algorithm
//
//1. Find a number of bits in x using size of operator
//2. Initialize left and right positions as 1 and n respectivily
//3. Do following while left '1' is smaller than r
//4. If bit at position '1' is not same as bit at position r then return false
//5. Increment '1' and decrement '1'
//6. If reach, it means didn't find a mismatching bit
//7. The expression is "x&(1<<(k-1)):"



public class binary_palindrome {
    public static void main(String[] args) {
        long num=5,n1;
        long reverse = 0;
        n1=num;

        while(n1>0)
        {
            reverse<<=1;
            if((n1&1)==1)
            {
                reverse^=1;
                n1>>=1;
            }
        }
        if(num==reverse)
        {
            System.out.println("Binary representation of is"+num);
        }
        else
        {
            System.out.println("Binary representation of is"+num);
        }
    }
}





