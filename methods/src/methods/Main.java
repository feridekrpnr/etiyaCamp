package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6 };
		int aranacak = 6;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
//			mesaj = "Sayi mevcuttur: " + aranacak;
//			mesajVer(mesaj);
			mesajVer("Sayi mevcut " + aranacak);

		} else {
			mesajVer("Sayi mevcut degildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
