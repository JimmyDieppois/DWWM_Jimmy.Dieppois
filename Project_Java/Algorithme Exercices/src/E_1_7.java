/*Exercice 1.7 : Tri de nombres 
Lire 2 nombres a et b. Les �crire dans l'ordre croissant.
Lire 3 nombres a, b et c. Les �crire dans l'ordre croissant.*/
import java.util.*;
public class E_1_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int [] array = {a , b, c};

		for (int entier : array) {
			System.out.println("nombre: " + entier);
		}

		Arrays.sort(array);

		System.out.println(" ");
		System.out.println("Tableau tri�\n");
		for (int entier : array) {
			System.out.println("nombre: " + entier);
			sc.close();

		}
	}
}
