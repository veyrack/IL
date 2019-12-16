package simulation;

import java.util.HashMap;

import Interfaces.IBuildOrder;
import construction.Entite;

public class BuildOrder implements IBuildOrder{

	private HashMap<Entite,Integer> hm;
	
	public BuildOrder() {
		
		hm=new HashMap<>();
		
	}
	
	public IBuildOrder optimiserBo(IBuildOrder bo) {
		//Supposer rendre un BO optimis� 
		return null; 
	}
	
	public void afficherBO() { // On peux retirer de la liste des entites du bo les �l�ments pr�sent dans la liste de base, ici pas fait
		System.out.println("------------------Voici le Bo : --------------------");
		//Parcourir la liste et renvoie son nom et sa valeur associ� 
		hm.forEach((key,value) -> System.out.println(key.getName()+" : "+value+ " -> temps de construction : "+key.getTpsCstr()*value+"s" ));
		
	}
	
	public void addBuildOrder(HashMap<Entite, Integer> ent) { //Comme son nom l'indique, ajoute la lise des entit�s � construire 
		hm=ent;
	}






	
}
