package patterns;
/**
* Created by Thivi
*/
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		
		for(int i=0;i<n;i++) {
			
			//Printing the spaces
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			//printing the pattern
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//n = 3
//  *
// **
//***
