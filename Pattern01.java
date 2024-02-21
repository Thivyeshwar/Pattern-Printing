package patterns;
/**
* Created by Thivi
*/
public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}


//step 1 : no.of lines = no.of rows = no.of time the outer for loop will run.
//
//step 2 : Indentify for every row no how many cols are there or types of elements in the col
//
//Step 3 : what do you need to print


//n = 5;
//
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *