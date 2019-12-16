package unites;

import construction.Etat;
import construction.Prerequis;
import construction.Unite;

public class Boss extends Unite{
	private static String name="Boss";
	private static int i; //Boss 1, boss 2 etc..
	
	
	public Boss(int dureeMobilisation, Etat etat) {
		super(200, 100, dureeMobilisation, etat,name,3);
		
		//construction des prérequis pour cette unité
		super.prerequis.add(Prerequis.Hall);
		super.prerequis.add(Prerequis.Caserne);
		
		
		i++;
		
	}

	public String getString() {
		return name;
	}
}
