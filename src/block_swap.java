// Block Swap ALgorithim

//divide the array two subarray with k as division point let them be x= arr[0....k-1]  and y= arr[l...n-1]
//        follow the below steps until size of a and b are the same.
//        if the size of a>b divide a into two postion s a1 and a2  such thata size of a1 is equalto the size of b.
//        then swap the subarray a1 and y this will change he aoriinal array formation from a1b2y to ba2a1
//        if the size fo b>a divide b into two portions b1 and b2 such thta the size of b2 is equal to the size of
//        A then swap the subarray a and b2 this will change the origina l array formation from ab1b2 to b2b1a
//        when the size size of a and b are the same swap them this alorithm need a repetitive call to the same chunk of  code this repetitive call can be achieved using two approached . they're the recursive approaches and iterative apporach. we will discuss the approach using programs.



import java.util.*;

class block_swap
{
    // Wrapper over the recursive function leftRotateRec()
    // It left rotates arr[] by d.
    public static void leftRotate(int arr[], int d,
                                  int n)
    {
        leftRotateRec(arr, 0, d, n);
    }

    public static void leftRotateRec(int arr[], int i,
                                     int d, int n)
    {
		/* Return If number of elements to be rotated
		is zero or equal to array size */
        if(d == 0 || d == n)
            return;
		
		/*If number of elements to be rotated
		is exactly half of array size */
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        else /* If B is shorter*/
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    public static void printArray(int arr[], int size)
    {
        int i;
        for(i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*This function swaps d elements
    starting at index fi with d elements
    starting at index si */
    public static void swap(int arr[], int fi,
                            int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2, 7);
        printArray(arr, 7);
    }
}


