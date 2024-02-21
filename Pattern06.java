package patterns;
/**
* Created by Thivi
*/
public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		for(int i =1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print((n-j+1) + " ");
			}
			System.out.println();
		}
	}
}
//n =5
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 

