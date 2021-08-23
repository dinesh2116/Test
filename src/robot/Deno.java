package robot;

import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
 
public class Deno {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N, K, sum = 0;
        N=sc.nextInt();
        K=sc.nextInt();
        int arr[]=new int[N];
        for(int i = 0; i < N; i++)
            arr[i]=sc.nextInt();
            
        Arrays.sort(arr, Collections.reverseOrder());       
  
        for(int i = 0; i < K; i++)
            sum = sum + arr[i];
  
        System.out.println(sum);
    }
}