import java.util.*;
public class E_3_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String rep;
		String rep2;
		do {
		int [] monTableau = {8 , 4 , 23 , 16 , 15 , 42};
		Arrays.sort(monTableau); 

		System.out.println("Entrez un nombre entre 1 et 50\n...or dont for what I care");
		int a = sc.nextInt();

		int position = existe (monTableau , a);

		if(position!=-1)
		System.out.println("Bravo le nombre : "+a+" est bien dans le tableau, a la position : "+position+"\n");
		System.out.println("\nVoulez vous voir le tableau ? O/N");
		sc.nextLine();
		rep = sc.nextLine();
		if (rep.equalsIgnoreCase("o")) {
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
