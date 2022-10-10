package fr.algorithmie;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes. Utilisez
 * Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom = "FirstLast6")
public class Ex11_FirstLast6 {

	
	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() throws Exception {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		// o elle vaut true si le tableau a au moins 1 élément et si le premier élément
		// ou le dernier élément vaut 6.
		// o elle vaut false dans les autres cas


		// TODO LOGUEZ la valeur obtenue pour chacun des 6 tableaux tab1 à tab6
		
		for (int i=1; i<=6; i++) {
			
			
	int[] tab =(int[])this.getClass().getDeclaredField("tab"+i).get(this);
	
	
	
	
	if ((tab.length>=1) && ((tab[0]==6) || (tab[tab.length-1]==6))) {
		for (int j=0; j<tab.length; j++) {
			Resultat.log(tab[j]);			
		}		
		Resultat.log("true");//affichage true 
	}else Resultat.log("false");
	
		}
		
				
		
		

	}

}
