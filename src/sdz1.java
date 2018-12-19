import java.util.Scanner;

public class sdz1 {

	public static void main(String[] args){
		int choix1;
		float resultat;
		char choix2;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT\n");
		do {
			System.out.println("-------------------------------------------------\n");
		
			do {
				System.out.println("choisissez le mode de convertion :");
				System.out.println("1 - Convertisseur Celsius -> Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit -> Celsius");
		
				Scanner sc1 = new Scanner(System.in);
				choix1 = sc1.nextInt();
			}while(choix1 != 1 && choix1 != 2);
		
			System.out.println("température à convertir :");
			Scanner sc2 = new Scanner(System.in);
			float valeur = sc2.nextInt();
		
			if(choix1 == 1) {
				resultat = 9f / 5f * valeur + 32;
				System.out.println(valeur +" °C correspondent à " + resultat + "°F");
			}else {
				resultat = ((valeur - 32) * 5) / 9;
				System.out.println(valeur +" °F correspondent à " + resultat + "°C");
			}
			do {
				System.out.println("Souhaitez-vous convertir une autre température?(O/N)");
				Scanner sc3 = new Scanner(System.in);
				choix2 = sc3.nextLine().charAt(0);
			}while(choix2 != 'O' && choix2 != 'N');
		} while(choix2 == 'O');
		System.out.println("Au revoir");
	}
}

