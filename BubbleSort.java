/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int n = N;
		int temp;
		int[] array = new int[N];
		for(int i=0;i<N;i++)
            array[i] =  Integer.parseInt(br.readLine());
        
        // BUBBLE SORT
        while(N>1){
            for(int i=0;i<N-1;i++){
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            N--;
        }
        //BUBBLE SORT
        
        for(int i=0;i<n;i++){
            bw.write(String.valueOf(array[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
	}
}
