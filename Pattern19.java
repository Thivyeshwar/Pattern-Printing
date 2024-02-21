package patterns;

/**
 * Created by Thivi
 */
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int space = 0;
		for (int i = 0; i < n; i++) {

			// printing pattern
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			space += 2;
		}
		space = (2*n)-2;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<=space-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			space -=2;
			System.out.println();
		}

	}

}

//n=3
//
//******
//**  **
//*    *
//*    *
//**  **
//******



