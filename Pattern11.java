package patterns;
/**
* Created by Thivi
*/
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int start = 1;
		
		for(int i=1;i<=n;i++) {
			if(i % 2 != 0) {
				start = 1;
			}else {
				start =0;
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(start + " ");
				start = 1 - start;
			}
			System.out.println();
		}

	}

}

//n = 3
//1
//0 1
//1 0 1