package interactiffibonacci;
import java.util.Scanner;
public class InteractifFibonacci {
	
	public static void main(String[] args){
		int n0 = 0;
		int n1 = 1;
		int n2=1;
		int n3;
		
		Scanner scanner = new Scanner(System.in) ;
		
		// Affichage d'un message
		System.out.println("Veuillez saisir un rang : ");
		
		int nb = scanner.nextInt();
		System.out.print(n0+ " " +n1+" "+n1+" ");
		for(int i = 3; i <=nb; i++){
			n3=n2+n1;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		System.out.println();
		
		
		scanner.close();
	}

}
