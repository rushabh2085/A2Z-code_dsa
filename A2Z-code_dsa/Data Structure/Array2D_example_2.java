import java.util.*;

public class Array2D_example_2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);


		System.out.print("Enter the size of the row :");
		int row = input.nextInt();
		System.out.print("Enter the size of the column :");
		int column = input.nextInt();
		
	

		int[][] arr = new int[row][column];
		
			int size = row * column;
		System.out.println("Enter the Total "+size+" values for array :\n");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++) {
				arr[i][j] = input.nextInt();

			}
		}


		System.out.println("The 2D Array :");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++) {
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}


	}
}