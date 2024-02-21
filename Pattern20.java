package patterns;
/**
* Created by Thivi
*/
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		
		int space = 2*n-2;
		
		for(int i=1;i<=2*n-1;i++) {
			int stars = i;
			if(i > n) {
				stars = 2*n-i;
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i <n) {
				space -= 2;
			}else {
				space += 2;
			}
			
		}
	}

}

//n = 3
//*    *
//**  **
//******
//**  **
//*    *
