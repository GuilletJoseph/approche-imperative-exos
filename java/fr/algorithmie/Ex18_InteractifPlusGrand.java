package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO LOGUEZ chaque nombre saisi avec Resultat.log
		// TODO Enfin LOGUEZ avec Resultat.log le max des 10 nombres
	
		int k=0;	
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Veuillez saisir le nombre  " +i+ ": ");		
			// Attente d'une saisie par l'utilisateur
			int nb = scanner.nextInt();	
			if (nb>k) k=nb;
					
			Resultat.log(nb);			
		}
				
		Resultat.log("Max:" + k);	
		
		scanner.close();
	}

}
