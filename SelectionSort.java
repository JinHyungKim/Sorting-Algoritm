/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    // SelectionSort
    static int[] selectionSort(int[] arr, int N){
        int minIdx, min, temp;
        for(int i=0;i<N-1;i++){
            minIdx = i;
            min = arr[i];
            
            for(int j=i+1;j<N;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }
    // SelectionSort
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++)
		    arr[i] = Integer.parseInt(br.readLine());
	    System.out.println(Arrays.toString(selectionSort(arr, N)));
	}
}
