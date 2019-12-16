package batiments;

import construction.Batiment;
import construction.Etat;
import construction.Prerequis;

public class Caserne extends Batiment {
	private static String name="Caserne";
	private static int i=0;
	
	
	public Caserne(int dureeMobilisation, Etat etat) {
		super(150, 100, dureeMobilisation, etat, name);
		
		//construction des prérequis pour cette unité
		super.prerequis.add(Prerequis.Ouvrier);
		super.prerequis.add(Prerequis.Ferme);
				
		i++;
		
	}
	
	public String getString() {
		return name;
	}

}
