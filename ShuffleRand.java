package exam;

import java.util.Random;
public class ShuffleRand 
{
	static void randomize( int arr[], int n)
	{
		Random r = new Random();
		for (int i = 0; i<n; i++) 
		{
			int j = r.nextInt(0,n);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = arr.length;
		randomize (arr, n);
	}
}


