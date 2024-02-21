package patterns;
/**
* Created by Thivi
*/
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		int space = 2 * (n-1);
		for(int i=1;i<=n;i++) {
			
			//Printing the number
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//Printing the space
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			//Printing the number
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
			space = space -2;
		}

	}

}

//n =5
//
//1        1
//12      21
//123    321
//1234  4321
//1234554321