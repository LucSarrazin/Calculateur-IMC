package ProjetPerso;
import java.util.Scanner;

public class CalculerIMC {

	public static void main(String[] args) {
		float poids;
		double taille,IMC;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entez votre poids en KG ");
		poids = scanner.nextFloat();
		
		System.out.println("Entrez votre taille en CM ");
		taille =  scanner.nextInt();
		taille = taille/100;

		IMC = poids / (taille * taille);
        IMC = Math.round(IMC * 10.0) / 10.0;
		
		if(IMC <=  15.9) {
			System.out.println("Vous êtes actuellement extrêmement maigre avec un IMC de : " + IMC);
		}
		else if(IMC >= 16.0 && IMC <= 18.9) {
			System.out.println("Vous êtes actuellement mince avec un IMC de : " + IMC);
		}
		else if(IMC >= 21.0 && IMC <= 24.9) {
			System.out.println("Vous êtes actuellement normal avec un IMC de : " + IMC);
		}
		else if(IMC >= 25.0 && IMC <= 29.9) {
			System.out.println("Vous êtes actuellement en surpoids avec un IMC de : " + IMC);
		}
		else if(IMC >= 30.0 && IMC <= 34.9) {
			System.out.println("Vous êtes actuellement en obésité modérée avec un IMC de : " + IMC);
		}
		else if(IMC >= 35.0 && IMC <= 39.9) {
			System.out.println("Vous êtes actuellement en obésité sévère avec un IMC de : " + IMC);
		}
		else if (IMC >= 40.0) {
			System.out.println("Vous êtes actuellement en obésité massive avec un IMC de : " + IMC);
		}

	}

}
