package 연습;

public class forTest3 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if (i == 3)
					if (j == 1) {
						System.out.println("<3단>");
					}
				if (i == 5)
					if (j == 1) {
						System.out.println("<5단>");
					}

				System.out.printf("%d * %d = %d \t", i, j, i * j);

				System.out.println();

			}
			System.out.println();
		}
	}

}
