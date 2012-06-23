import java.util.*;
import java.lang.*;


public class Solution {

	/**
	 * @param args
	 */
	static int N;
	static long K;
	static long result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Hashtable numbers = new Hashtable();
		
		N = in.nextInt();
		K = in.nextLong();
		
		long[] arr = new long[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = in.nextLong();
			numbers.put(Long.toString(arr[i]), arr[i]);
		}
		
		result = 0;
		
		for(int i=0;i<N;i++)
		{
			long tmp = 0,tmp2 = 0; 
			tmp = arr[i] + K;
			try
			{
				tmp2 = (Long) numbers.get(Long.toString(tmp));
				result++;
			}
			catch(Exception ex)
			{
				
			}

		}
		
		System.out.println(result);

	}

}