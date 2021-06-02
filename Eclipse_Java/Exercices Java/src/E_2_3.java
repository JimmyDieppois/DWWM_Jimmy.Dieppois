/*Exercice 2.3 : Jeu de la fourchette 
L'ordinateur � choisit � un nombre entier compris entre 0 et 100. Le joueur essaie de le deviner. 
Lors de chaque essai, l'ordinateur affiche la � fourchette � dans laquelle se trouve le nombre qu'il a choisi. 
Le choix du nombre par l'ordinateur sera simul� par g�n�ration d'un nombre al�atoire : N <-- RANDOM(0,100*/


import java.util.Random;
import java.util.Scanner;
public class E_2_3 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int min = 0;
		int max = 100;
		int nbUser;

		int compteur=0;
		Random aleas= new Random();
		int nbMachine = aleas.nextInt(101);	

		boolean continuer = false;


		String r�ponse;
		do {

			min = 0;
			max = 100;
			compteur=0;
			nbMachine = aleas.nextInt(101);	


			do {
				System.out.println("Choisissez un nombre entre : "+ min+ " et " +max);
				System.out.println("Vous avez " + (5-compteur) +" essaies");
				nbUser=sc.nextInt();

				if (nbUser > nbMachine) {

					max=nbUser;
					compteur++;
					continuer=false;
				}
				else if(nbUser<nbMachine)
				{
					min=nbUser;
					compteur++;
				}
				else 
				{
					compteur++;
					continuer=true;
				}
			}
			while ( continuer==true || compteur <=4 );

			if (continuer) {
				System.out.println("Victoire, vous avez r�ussi en :" +compteur +"coups");
			} else {
				System.out.println("Perdue");
				System.out.println("Le nombre recherch� �tait " +nbMachine );
			}

			System.out.println("Voulez vous rejouer ? O/N" );
			sc.nextLine();
			r�ponse = sc.nextLine();
		} while (r�ponse.equals("O"));

		sc.close();
	}			


}
