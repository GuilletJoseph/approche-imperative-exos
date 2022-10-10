package fabriquemur;

import java.util.Scanner;


public class FabriqueMur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tests devérification
		
		Scanner scanner = new Scanner(System.in) ; //creer l'objet scanner
		System.out.println("Combien briques de longueur 1 : ");//affichage message

		int nbSmall = scanner.nextInt();	//lire combien des briques 1
		
		System.out.println("Combien briques de longueur 2 : ");//affichage message

		int nbBig = scanner.nextInt();	 //lire combien des briques 2
		
		System.out.println("La taille du mur? ");//affichage message

		int longueur = scanner.nextInt();	//lire la taille du mur
		
		verifier(nbSmall, nbBig, longueur); //envoyer variables au fonction verifier, donc true ete supprime
		
		
		
		scanner.close();//ferme le scanner
		
		
		
		
	//	verifier(3, 1, 8, true);   True pas besoin!
		
	}
	static boolean fabriquerMur(int  nbSmall, int nbBig, int longueur) {
		boolean resultat= false;
		
		
if (longueur<=(nbSmall*1)+(nbBig*5)) {		//si le variable longeur moins qui calcul
		
	resultat=true; //envoyer true
}else { 
	resultat=false; //si non
}		
		return resultat;		 //envoyer false
		}
	
	
	static void calculeMur(int  nbSmall, int nbBig, int longueur) {
		int k=0;
		int n=0;
		int comSmall=0;
		int comBig=0;
		
		k=(nbSmall*1)+(nbBig*5); //trouver combien des briques besoin
	
	n =  k-longueur;
	comSmall=nbSmall-n;
	comBig=longueur%(nbBig*5);	
	System.out.println("il suffit de prendre " +comSmall+ " briques de longueur de 1 et "+comBig+ " brique de 2.");
	
	
	}
	
	private static void verifier(int  nbSmall, int nbBig, int  longueur) {//fonction verifier pour afficher le reponse
			if(fabriquerMur(nbSmall, nbBig, longueur) == true) {
				
				System.out.println("Test ("+ nbSmall+ ", "+ nbBig+ ", "+ longueur+ ") la réponse est OUI,");
				calculeMur(nbSmall, nbBig, longueur);
				} else {					
					System.out.println("Test ("+ nbSmall+ ", "+ nbBig+ ", "+ longueur+ ") la réponse est NON.");
				}
			}
	

}
