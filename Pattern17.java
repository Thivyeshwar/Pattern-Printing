package patterns;

/**
 * Created by Thivi
 */
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			int breaks = (2 * i + 1) / 2;
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(ch);
				if (j < breaks) {
					ch++;
				} else {
					ch--;
				}
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

//
//n = 3
//
//  A
// ABA
//ABCBA
