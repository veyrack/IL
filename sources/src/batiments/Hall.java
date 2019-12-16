package batiments;

import construction.Batiment;
import construction.Etat;
import construction.Prerequis;

public class Hall extends Batiment{
	private static String name="Hall";
	
	private int fournit;
	private static int i;
	
	public Hall(int dureeMobilisation, Etat etat) {
		super(200, 120, dureeMobilisation, etat, name);
		
		//construction des prérequis pour cette unité
			super.prerequis.add(Prerequis.Ouvrier);
			super.prerequis.add(Prerequis.Caserne);
				
			i++;
		
	}
	
	public String getString() {
		return name;
	}
}
