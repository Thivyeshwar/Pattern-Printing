package patterns;
/**
* Created by Thivi
*/
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		
		for(int i=0;i<n;i++) {
			char ch = (char)('A'+i);
			for(int j=0;j<=i;j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

}

//n = 3
//A
//B B
//C C C