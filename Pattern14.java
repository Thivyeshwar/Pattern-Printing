package patterns;
/**
* Created by Thivi
*/
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		for(int i=1;i<=n;i++) {
			for(char ch = 'A';ch<='A'+i-1;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}

	}

}

//n =3;
//A
//A B
//A B C
