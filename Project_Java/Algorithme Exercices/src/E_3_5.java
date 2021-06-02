/* Exercice 3.5 : Palindrome 
Un palindrome est une chaîne de caractères que l'on peut lire identiquement de droite à gauche, et gauche à droite.
Par exemple:
AA. 38783. LAVAL. LAVAL A ETE A LAVAL. ET LA MARINE VA VENIR A MALTE
Soit une chaîne de caractères terminée par un point. 
Ecrivez l'algorithme d'un programme permettant d'affirmer si cette phrase est ou non un palindrome.
Si la chaîne de caractères n'est composée que du caractère '.', le message 'LA CHAINE EST VIDE' sera affiché.
Proposez un jeu d'essai prévoyant les 3 cas suivants :
▪ la phrase est vide
▪ la chaîne de caractères n'est pas un palindrome
▪ la chaîne de caractères est un palindrome
 */
import java.util.*;
public class E_3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int k = 2;
		String rep ="";
		do {
		
		System.out.println("Ecris phrase ou une suite de nombre terminé par un point.");
		String phrase = "je test une phrase ou une suite de nombre";
		phrase = sc.nextLine();
		
		System.out.println(phrase);
		
		
		
		phrase = phrase.replaceAll("\\p{Punct}", "");
		
		phrase = phrase.replaceAll(" ", "");
		
		if (phrase.equalsIgnoreCase("")) {
			
		System.out.println("LA CHAINE EST VIDE");
			
		} else {
		System.out.println(phrase);
		
		int a = 0;
		int c =phrase.length()-1;
		

		
		do { 
			
			char b = phrase.charAt(a);
			char d = phrase.charAt(c);
			
			System.out.println(b);
			System.out.println(d);
			if (b == d) {
			
				a = a+1;
				c = c-1;
			}
			else {
				
				k = 5;
				System.out.println("PAS Palindrome");	
				System.out.println(b+" n'est pas égale à "+d);	
				break;
			}
			System.out.println(a);
			
			System.out.println(c);
		} while ( a <= c );
		
		if (k==2) {
			System.out.println("Palindrome");	
		}
		
		}
		System.out.println("Voulez-vous continuer ? O/N ");
		
		rep = sc.nextLine();
		
		
		
		
		}while (rep.equalsIgnoreCase("o"));
		
		
		
		
		
		System.out.println("Fin");	
	
		
		
		sc.close();
	}
}
		
		
		
		
