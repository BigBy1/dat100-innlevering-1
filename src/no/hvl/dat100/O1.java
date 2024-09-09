package no.hvl.dat100;

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class O1 {

	private static int a = 0;
	private static String karakter = "";

	public static void main(String[] args) {

		antallUtskrivinger(7);

	}

	private static void utskriving() {

		a++;

		out.print("Karakter " + a + ": " + karakter);

	}

	public static void antallUtskrivinger(int x) {
		for (int i = 0; i < x; i++) {
			karakter();

		}
	}

	private static void karakter() {

		String poeng = showInputDialog("Poengsummen");

		try {
			int poengTall = Integer.parseInt(poeng);

			// karakter A
			if (poengTall <= 100 && poengTall >= 90) {
				karakter = "A, ";
				utskriving();
			}

			// karakter B
			else if (poengTall <= 89 && poengTall >= 80) {
				karakter = "B, ";
				utskriving();
			}

			// karakter C
			else if (poengTall <= 79 && poengTall >= 60) {
				karakter = "C, ";
				utskriving();
			}

			// karakter D
			else if (poengTall <= 59 && poengTall >= 50) {
				karakter = "D, ";
				utskriving();
			}

			// karakter E
			else if (poengTall <= 49 && poengTall >= 40) {
				karakter = "E, ";
				utskriving();

			} else if (poengTall <= 39 && poengTall >= 0) {
				karakter = "F, ";
				utskriving();

			} else if (poengTall < 0 || poengTall > 100) {
				showMessageDialog(null, "det er kun lov til å skrive et tall mellom 0-100");
				antallUtskrivinger(1);
			}

		} catch (NumberFormatException e) {
			
			showMessageDialog(null, "det er kun lov til å skrive et tall mellom 0-100");
			
			antallUtskrivinger(1);
		}

	}

}
