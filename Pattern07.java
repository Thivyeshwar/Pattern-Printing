package patterns;
/**
* Created by Thivi
*/
public class Pattern07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}	

	}

}
//
//n=3
//   *  
//  *** 
// ***** 
