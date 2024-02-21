package patterns;

/**
 * Created by Thivi
 */
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;

		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {

				int top = i;
				int left = j;
				int right = (2 * n - 2) - j;
				int bottom = (2 * n - 2) - i;

				System.out.print(n - Math.min(Math.min(top, left), Math.min(right, bottom)));
			}
			System.out.println();
		}
	}

}

//n = 3
//
//33333
//32223
//32123
//32223
//33333
