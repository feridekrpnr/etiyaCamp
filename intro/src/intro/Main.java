package intro;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
            int sayac=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac = 1;
                }
            }
                if (sayac == 0) {
                    System.out.println(i);
                }

            }

	}
}
