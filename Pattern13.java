package patterns;
/**
* Created by Thivi
*/
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+ " ");
				num = num + 1;
			}
			System.out.println();
		}
	}

}

//n = 3
//
//1
//2 3
//4 5 6