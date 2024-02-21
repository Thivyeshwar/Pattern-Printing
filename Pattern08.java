package patterns;
/**
* Created by Thivi
*/
public class Pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
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

//n=3
// * * * * *
//   * * *
//     *