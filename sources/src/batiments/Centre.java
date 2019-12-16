package batiments;

import construction.Batiment;
import construction.Etat;
import construction.Prerequis;

public class Centre extends Batiment{
	
	private static String name="Centre";
	private int fournit;
	private static int i;
	
	public Centre(int dureeMobilisation, Etat etat) {
		super(300, 200, dureeMobilisation, etat, name);
		
		//construction des prérequis pour cette unité
		
		super.prerequis.add(Prerequis.Ouvrier);
		
		
			i++;
		
	}
	
	public String getString() {
		return name;
	}
	
	
	
}
