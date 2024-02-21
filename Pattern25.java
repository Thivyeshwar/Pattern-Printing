package patterns;
/**
* Created by Thivi
*/
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
				for(int k=1;k<=(2*i-1);k++) {
					if(k==1||i==n||k==2*i-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}

//n = 4
//
//*******
// *   *
//  * *
//   *