import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {5, 1, 6, 2, 4, 3};
		int i, j, key;
		for(i=1; i<6; i++)
		{
		  key = arr[i];
		  j = i-1;
		  while(j>=0 && key < arr[j])
		  {
		    arr[j+1] = arr[j];
		    j--;
		  }
		  arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
