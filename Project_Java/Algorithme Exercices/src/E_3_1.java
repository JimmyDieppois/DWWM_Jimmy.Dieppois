/*Exercice 3.1 : Rechercher un nombre dans un tableau 
Soit un tableau de nombres tri�s par ordre croissant.
Chercher si un nombre donn� N figure parmi les �l�ments. 
Si oui, indiquer la valeur de l'indice correspondant. Sinon, indiquer � Non trouv� �*/

	import java.util.*;
	public class E_3_1 {
		public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			String rep;
			String rep2;
			do {
			int [] monTableau = {4, 16 , 23, 42 ,8 ,15 };
			
			Arrays.sort(monTableau); 

			System.out.println("Entrez un nombre entre 1 et 50\n");
			int a = sc.nextInt();

			int position = existe (monTableau , a);

			if(position!=-1)
			System.out.println("Bravo le nombre : "+a+" est bien dans le tableau, a la position : "+position+"\n");
			System.out.println("\nVoulez vous voir le tableau ? O/N");
			sc.nextLine();
			rep = sc.nextLine();
			if (rep.equalsIgnoreCase("o"))
			
			for (int i : monTableau) {
			System.out.print(i + "");	
			
			}
			{
				System.out.println(Arrays.toString(monTableau));
				System.out.println(" ");
			}
			System.out.println("\nVoulez vous recommencer ? O/N");
			rep2 = sc.nextLine();
			}
			while (rep2.equalsIgnoreCase("o"));
			System.out.println("\nFin");
			sc.close();
		}

		static int existe(int monTableau[], int a){
			for (int i  = 0; i < monTableau.length ; i++) 
			{
				if (a == monTableau[i])
					return i;
			}
			System.out.println("Non Trouve");
			return -1;
		}

	}
	
	
	
	/*Random aleas = new Random();
	for for (int i = 0; i < monTableau.length; i++) {
		monTableau[i]=aleas.nextInt(51);
	}
	
	 */
	
	//Saisir donn�es dans un tableau
	/*System.out.println("Entrez 5 chiffres entre 1 et 50 dans un tableau");
	int [] monTableau = new int [51];
	monTableau [0] = sc.nextInt();
	sc.nextLine();
	monTableau [1] = sc.nextInt();
	sc.nextLine();
	monTableau [2] = sc.nextInt();
	sc.nextLine();
	monTableau [3] = sc.nextInt();
	sc.nextLine();
	monTableau [4] = sc.nextInt();
	sc.nextLine();
	monTableau [5] = sc.nextInt();
	sc.nextLine();*/
