public class RotateArray {

		   public static void main(String[] args) {
		      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		      int m = array.length;
		      int last, i;
		      System.out.print("The original array is: ");
		      for (i = 0; i < m; ++i)
		      System.out.print(array[i] + " ");
		      last = array[m-1];
		      for (i = m-1; i > 0; i--)
		      array[i] = array[i-1];
		      array[0] = last;
		      System.out.print("\nThe rotated Array is: ");
		      for (i = 0; i < m; ++i)
		      System.out.print(array[i] + " ");
		   }
		}