package patterns;
/**
* Created by Thivi
*/
public class Pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

//n = 5
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

