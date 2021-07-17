/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{

    //MergeSort
    static void merge(int[] arr, int[] sortedArr, int leftStart, int leftEnd, int rightStart, int rightEnd){
        int i, j, k;
        i = leftStart;
        j = rightStart;
        k = leftStart;

        while(i<=leftEnd && j<=rightEnd){
            if(arr[i]>arr[j])
                sortedArr[k++] = arr[j++];
            else
                sortedArr[k++] = arr[i++];
        }
        
        if(i<=leftEnd)
            for(;i<=leftEnd;i++)
                sortedArr[k++] = arr[i];
        
        else if(j<=rightEnd)
            for(;j<=rightEnd;j++)
                sortedArr[k++] = arr[j];
        
        for(int l=leftStart;l<=rightEnd;l++)
            arr[l] = sortedArr[l];
    }
    
    static void mergeSort(int[] arr, int[] sortedArr, int start, int end){
        int mid;
        if(start<end){
            mid = (start+end)/2;
            mergeSort(arr, sortedArr,start, mid);
            mergeSort(arr, sortedArr,mid+1, end);
            merge(arr, sortedArr, start, mid, mid+1, end);
        }
    }
    //MergeSort
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] sortedArr = new int[N];
		for(int i=0;i<N;i++)
		    arr[i] = Integer.parseInt(br.readLine());
        mergeSort(arr, sortedArr, 0, arr.length-1);
        System.out.println(Arrays.toString(sortedArr));
	}
}
