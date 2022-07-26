package longestIncreasingsubsequence;


	
	import java.util.Scanner;
	public class LIS {
	 
	    public int[] lis(int[] X)
	    {        
	        int n = X.length - 1;
	        int[] q = new int[n + 1];  
	        int[] P = new int[n + 1]; 
	        int L = 0;
	 
	        for (int i = 1; i < n + 1; i++)
	        {
	            int j = 0;
	 
	            for (int pos = L ; pos >= 1; pos--)
	            {
	                if (X[q[pos]] < X[i])
	                {
	                    j = pos;
	                    break;
	                }
	            }            
	            P[i] = q[j];
	            if (j == L || X[i] < X[q[j + 1]])
	            {
	                q[j + 1] = i;
	                L = Math.max(L,j + 1);
	            }
	        }
	 
	        /* backtrack */
	 
	        int[] result = new int[L];
	        int pos = q[L];
	        for (int i = L - 1; i >= 0; i--)
	        {
	            result[i] = X[pos];
	            pos = P[pos];
	        }
	        return result;             
	    }
	 
	    
	    public static void main(String[] args) 
	    {    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Longest Increasing Subsequence \n");
	 
	        System.out.println("Enter number of elements");
	        int n = scan.nextInt();
	        int[] arr = new int[n + 1];
	        System.out.println("\nEnter "+ n +" elements");
	        for (int i = 1; i <= n; i++)
	            arr[i] = scan.nextInt();
	 
	        LIS obj = new LIS(); 
	        int[] result = obj.lis(arr);     
	        System.out.print("\nLongest Increasing Subsequence : ");
	        for (int i = 0; i < result.length; i++)
	            System.out.print(result[i] +" ");
	        System.out.println();
	        
	        System.out.println("\nLength of the  increasing subsequence is "+result.length);
	    }
	}