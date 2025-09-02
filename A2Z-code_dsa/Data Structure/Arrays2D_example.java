import java.util.*;
public class Arrays2D_example
{
	public static void main(String[] args) {
	
		int arr[][] = {
		    {1,2,3},
		    {4,5,6},
		    {7,8,9},
		};
		
		for(int i = 0 ; i < 3 ;i++){
		    for(int j = 0 ; j< 3 ; j++){
		        System.out.print(arr[i][j]+" ");
		    
		    }
		    System.out.println();
		}
		
		
		System.out.println("Arrays form : \n"+Arrays.deepToString(arr)+"\n");
		
	}
	
	
}


/*
 
OUTPUT :


1 2 3 
4 5 6 
7 8 9 
Arrays form : 
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]



*/