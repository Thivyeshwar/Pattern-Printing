package patterns;
/**
* Created by Thivi
*/
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

//n =3
//
//*
//* *
//* * *
//* *
//*
