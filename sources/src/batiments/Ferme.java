package batiments;

import construction.Batiment;
import construction.Etat;
import construction.Prerequis;

public class Ferme extends Batiment {

	private static String name="Ferme";
	private int fournit;
	private static int i;
	
	public Ferme(int dureeMobilisation, Etat etat) {
		super(300, 200, dureeMobilisation, etat, name);
		
		//construction des prérequis pour cette unité
			
			i++;
		
	}
	
	public String getString() {
		return name;
	}

}
