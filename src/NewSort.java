import java.util.*;
public class NewSort {

	
		// TODO Auto-generated method stub
		void selectionSort(int a[], int size)
		{
		  int i, j, min, temp;
		  for(i=0; i < size-1; i++ )
		  {
		    min = i;   //setting min as i
		    for(j=i+1; j < size; j++)
		    {
		      if(a[j] < a[min])   //if element at j is less than element at min position
		      {
		       min = j;    //then set min as j
		      }
		    }
		   temp = a[i];
		   a[i] = a[min];
		   a[min] = temp;
		  }
		  System.out.println(Arrays.toString(a));
		}
		public static void main(String[] args) {
			
			int arr[]= {7,2,5,9,1,0};
			NewSort nb = new NewSort();
			nb.selectionSort(arr,6);
			
			}
		}
	


