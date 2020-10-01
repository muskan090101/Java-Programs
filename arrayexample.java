//program of sorting the arrays
import java.util.Arrays;
import java.util.Scanner;

public class arrayexample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//One dimensional array
		int b[] = {1,2,3,4,5};
		int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		for(int i =0; i<a.length; i++)
		{
			
			System.out.print(a[i]+" ");
		
		}
		System.out.println("");
		Arrays.sort(a);
		for(int i =0; i<a.length; i++)
		{
			
			System.out.print(a[i]+" ");
		
		}
		System.out.println();
		System.out.println(Arrays.asList(a));
		System.out.println(Arrays.binarySearch(a, 3));
		
		
		System.out.println();
		
		Arrays.toString(a);
		
		for(int i =0; i<a.length; i++)
		{
			
			
			System.out.print(a[i]+" ");
		
		}
		
		
		
		

		}

}
