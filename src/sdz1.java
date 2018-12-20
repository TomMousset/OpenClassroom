import java.util.Scanner;

public class sdz1 {

	private static Scanner sc3;
	private static Scanner sc2;
	private static Scanner sc1;

	public static void main(String[] args){
		String choix1;
		float reponse = new Float(0);
		float resultat;
		String choix2;
		boolean conformite;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT\n");
		do {
			System.out.println("-------------------------------------------------\n");
		
			do {
				System.out.println("choisissez le mode de convertion :");
				System.out.println("1 - Convertisseur Celsius -> Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit -> Celsius");
		
				sc1 = new Scanner(System.in);
				choix1 = sc1.next();
			}while(!choix1.equals("1") && !choix1.equals("2"));
		
			do {
			System.out.println("température à convertir :");
			sc2 = new Scanner(System.in);
			String valeur = sc2.next();	

			try {
			    reponse = Float.valueOf(valeur);
			    conformite = true;
			}
			catch (NumberFormatException nfe) {
				conformite = false;
			}
			}while(!conformite);
			
			if(choix1.equals("1")) {
				resultat = 9f / 5f * reponse + 32;
				System.out.println(reponse +" °C correspondent à " + resultat + "°F");
			}else {
				resultat = ((reponse - 32) * 5) / 9;
				System.out.println(reponse +" °F correspondent à " + resultat + "°C");
			}
			do {
				System.out.println("Souhaitez-vous convertir une autre température?(O/N)");
				sc3 = new Scanner(System.in);
				choix2 = sc3.nextLine();
				choix2 = choix2.toUpperCase();
				System.out.println(choix2);
				if(choix2.isEmpty()){
					choix2 = "O";
				}
			}while(!choix2.equals("O") && !choix2.equals("N"));
		} while(choix2.equals("O"));
		System.out.println("Au revoir");
	}
}