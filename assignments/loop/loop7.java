package loop;

public class loop7 {

	public static void main(String[] args) {

		int i = 2;
		int count = 0;
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				System.out.print(i + " ");
				i++;
			}
			System.out.println("");
			i = 2;
			count++;
			i = i + count;
		}
	}
}
