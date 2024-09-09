package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {

		int sumTot = 0;
		int sum = 0;
		String Sn = showInputDialog("fakultet av: (Tall mellom 1-10)");
		int n = Integer.parseInt(Sn);
		
		if (n > 0 && n<=10) {

			for (int i = 1; n >= i; i++) {

				int k = i;

				if (i == 1) {
					sum = k * i;
				} else {
					sum = sumTot * k;
				}

				sumTot = sum;

			}
			System.out.print(sumTot);
		}
		else {
			// det ga meg feile tall viss svaret ble for stort. jeg tok da og avgrensa dette for sikkerhets
			//skyld
			System.out.print("Eror: bare tall mellom 1-10");
		}

	}

}
