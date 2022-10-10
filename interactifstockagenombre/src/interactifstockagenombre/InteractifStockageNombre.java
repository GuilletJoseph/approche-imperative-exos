package interactifstockagenombre;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {		
		
		// TODO Auto-generated method stub	
		int arr[] = new int[0];	 //declarer une table
		int nb; 		  
		  Scanner scanner = new Scanner(System.in) ;		  
	do {	  
			System.out.println("1. Ajouter un nombre  ");			
			System.out.println("2. Afficher les nombres existants.  ");//creation menu
			System.out.println("3. Fin.  ");
			nb = scanner.nextInt();		//lire le numero		
			switch (nb) {	//choisir		
			case 1: //si numero 1
				System.out.println("1. Ajouter un nombre: ");//demande une chiffre
				int nf = scanner.nextInt();	//lire
				int[] arr2 = new int[arr.length+1];    //creer deuxieme table    
		          System.arraycopy(arr, 0, arr2, 0, arr.length); //copier au table arr2
		          arr=arr2;//ajouter au table arr
		          arr[arr.length-1]=nf;	//ajouter au dernier index
				break;			
			case 2: //si numero 2
				System.out.println("2. Afficher les nombres existants.  ");
				for(int a: arr) {//boucle d'affichage le table arr
		            System.out.print(a+" "); 
		        }	
				System.out.println(" ");
				break;				
				
			}					
	}while (!(nb==3));	//si choisir n 3		
			scanner.close();        
          
	}
}
