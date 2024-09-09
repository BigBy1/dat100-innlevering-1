package no.hvl.dat100;

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class O2 {

	private static double s1 = 0;
	private static double s2 = 0;
	private static double s3 = 0;
	private static double s4 = 0;
	private static double s5 = 0;
	
	
	private static int q1 = 0;
	private static int q2 = 0;
	private static int q3 = 0;
	private static int q4 = 0;
	private static int q5 = 0;
	
	
	private static double inntektTall = 0;
	private static double sum = 0;
	

	public static void kalkulator() {
		
		// her går det trinn vis nedover takket være løkken i main. Jeg bruker q variabler for at
		// viss du starter på for eksempel trinn 5 skal du igjennom de andre if setningene også.
		// Koden skal heller ikke igjennom samme if settningen mer enn en gang.
		
		//Jeg la også merke til viss jeg ikke satt inntektTall = 0 så tullet det med koden senere.
		if (inntektTall <= 292850 && inntektTall >= 208050 || q2>0) {
			if (q2==0) {
				sum = inntektTall-208050;
			}
			else {
				sum=84800;
			}
			s1 = (sum / 100) * 1.7;
			q1=1;
			q2=0;
			inntektTall=0;
		}
		else if (inntektTall >= 292851 &&  670000 >= inntektTall || q3>0) {
			if(q3==0) {
			sum = inntektTall-292851;
			}
			else {
				sum=377149;
			}
			s2 = (sum / 100) * 4.0;
			q3=0;
			q2=1;
			inntektTall=0;
			
		}
		else if (inntektTall >= 670001 &&  937900 >= inntektTall || q4>0) {
			if (q4==0) {
			sum = inntektTall-670000;
			}
			else {
				sum=267900;
			}
			s3 = (sum / 100) * 13.6;
			q4=0;
			q3=1;
			inntektTall=0;
		}
		else if (inntektTall >= 937901 &&  1350000 >= inntektTall || q5>0) {
			if(q5==0) {
			sum = inntektTall-937901;
			}
			else {
				sum = 412099;
			}
			s4 = (sum / 100) * 16.6;
			q4=1;
			q5=0;
			inntektTall=0;
		}
		else if (inntektTall>1350000) {
			sum = inntektTall-1350000;
			s5 = (sum / 100) * 17.6;
			q5 = 1;
			inntektTall=0;
		}
		
	}

	public static void main(String[] args) {
		
		
		String inntekt = showInputDialog("Inntekten din (uten desimaler)");

		// se om tallet som er slått inn er gyldig
		try {
			
			inntektTall = Integer.parseInt(inntekt);

		} catch (NumberFormatException e) {
			showMessageDialog(null, "det er kun låv til å skrive inn tall (det inkluderer mellomrom)");
			return;

		}

		double inntektTall = Double.parseDouble(inntekt);

		if (inntektTall <= 208050) {
			out.print("Gode nyheter, du slipper å betale!");
		} else if (inntektTall < 0) {
			out.print("Beklager, men vi kan ikke regne ut negativ inntekt");
		} else {
			kalkulator();
		}
		
		
		//returnerer til kalkultatoren for å regne ut resten
		while (q5==1||q4==1||q3==1||q2==1) {
		kalkulator();
		}
		
		//legger sammen skatten
		if (s1+s2+s3+s4+s5>0) {
			out.println("Trin 1: "+s1+ "kr");
			out.println("Trin 2: "+s2+ "kr");
			out.println("Trin 3: "+s3+ "kr");
			out.println("Trin 4: "+s4+ "kr");
			out.println("Trin 5: "+s5+ "kr");
			
			//gjør biløpet om til heltall og runder av til nærmeste hele tall, ved å legge til 0,5.
			double totSkatt= s1+s2+s3+s4+s5+0.5;
			
			int totSkattI = (int) totSkatt;
			
			//måtte skille de ut da det for en eller annen grunn ga feil svar
			out.print("Til sammen må du betale: ");
			out.print(totSkattI+"kr, i trinnskatt");
		}
	}

}
