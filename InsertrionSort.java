/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    // InsertionSort
    static void insertionSort(int[] arr, int N){
        for(int i=1;i<N;i++){
            int cmp_i = i;
            for(int j=i-1;j>=0;j--){
                if(arr[cmp_i]>=arr[j])
                    break;
                else{
                    arraySwap(arr, cmp_i, j);
                    cmp_i--;
                }
            }
        }
    }
    // InsertionSort
    
    static void arraySwap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] srcArray = new int[N];
		for(int i=0;i<N;i++)
		    srcArray[i] = Integer.parseInt(br.readLine());
        insertionSort(srcArray, N);
        System.out.println(Arrays.toString(srcArray));
	}
}
