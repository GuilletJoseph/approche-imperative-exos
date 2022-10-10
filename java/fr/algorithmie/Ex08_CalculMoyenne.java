package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).
		int v =array[0];
		for (int i=1; i<array.length; i++) {			
				v=array[i]+v;	//ajouter chaque valeur		
		}
      double moyenne= (v*1.0)/array.length;//trouver moyenne des valeurs
		Resultat.log(moyenne);
	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
		int v =0;
		int k=0;
		for (int i=0; i<array.length; i++) {
			if (array[i]>0) {//si trouve des valeurs supeireur 0 
				v=array[i]+v;	//ajouter cahque valeur
				k++;
			}
		}
		Resultat.log(v);
		Resultat.log(k);
      double moyenne= (v*1.0)/k;//trouver moyenne
		Resultat.log(moyenne);
		
	}

}
