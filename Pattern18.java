package patterns;
/**
* Created by Thivi
*/
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		for(int i=0;i<n;i++) {
			
			
			for(char ch = (char) ('E'-i);ch<='E';ch++) {
				System.out.print(ch+ " ");
			}
			System.out.println();
		}

	}

}

//n =3;
//
//E
//D E
//C D E
