import java.util.Scanner;

public class sdz1 {

	public static void main(String[] args){
		
		System.out.println("\n\n--------------------------------------Conversation--------------------------------------\n\n");
		System.out.println("Ordi :\t Veuillez saisir votre prénom !");
		System.out.print("Moi :\t");
		Scanner sc1 = new Scanner(System.in);
		String prenom = sc1.nextLine();
		System.out.println("Ordi :\tOK !");
		System.out.println("Ordi :\tTiens voila Jaques qui arrive !");
		System.out.println("Jaques :\tBonjour !");
		
		System.out.print("Moi :\t");
		Scanner sc2 = new Scanner(System.in);
		String mot = sc2.nextLine();

		switch(mot) {
		  case "Bonjour":
		    System.out.println("Jaques :\tFraîche matinée pas vrai !");
		    break;
		  case "Bonsoir":
		    System.out.println("Jaques :\tMais on n'est pas le soir !");
		    break;
		  case "Salut":
		    System.out.println("Jaques :\tEt la politesse, tu as oublié ???");
		    break;
		  case "":
		    System.out.println("Jaques :\tAlors tu me réponds ???");
		    break;
		  default:
		    System.out.println("Jaques :\tDe quoi ???");
		}
		
		System.out.println("\n\n------------------------------------------Fin-------------------------------------------\n\n");
																	  
	}
}

