package patterns;
/**
* Created by Thivi
*/
public class Pattern09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		for(int i=1;i<=n;i++) {
			
			//printing the space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//printing start
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			//printing the space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			
			//printing the space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//printing the start
			for(int j=0;j<(2*n)-(2*i+1);j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

//n = 3
//
//  *
// ***
//*****
//*****
// ***
//  *