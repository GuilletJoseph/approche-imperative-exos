package fr.algorithmie;

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
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// NE PAS CHANGER LES NOMS
	// mais vous pouvez modifier les valeurs contenues dans array
	int[] array = {0, 1, 2, 3};

	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Effectuez une rotation à droite des éléments du tableau array
		// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3 ,0, 1, 2}
		// après rotation.   
		// C'est à dire que tous les éléments sont "décalés" vers la droite.
		// Cas particulier : L'élément le plus à droite (3) sort du tableau et revient en 1ère case.
		
	int k=0;
		for (int i=array.length-1; i>0; i--) {	
			 k=array[i-1];//prener variable 3 et ajouter en k
			 array[i-1]=array[i];	//changer le variable 2 par le 3
			 array[i]=k;			
		}
		
		for (int i=0; i<array.length; i++) {
			
			Resultat.log(array[i]);
		}
		// TODO Afficher le contenu du tableau après rotation avec Resultat.log
	}

}
