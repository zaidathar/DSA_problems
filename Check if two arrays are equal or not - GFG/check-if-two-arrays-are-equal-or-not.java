// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Map<Long, Long> mapA = new HashMap<>();
        Map<Long, Long> mapB = new HashMap<>();
        for(Long num:A){
            Long value = mapA.get(num);
            mapA.put(num , value != null ? value+1 : 1 );
        }
        for(Long num:B){
            Long value = mapB.get(num);
            mapB.put(num , value != null ? value+1 : 1 );
        }
        
        for(Map.Entry<Long,Long> set : mapA.entrySet()){
            if(set.getValue()!=mapB.get(set.getKey()))return false;
        }
        return true;
    }
}