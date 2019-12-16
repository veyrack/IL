package unites;

import construction.Etat;
import construction.Prerequis;
import construction.Unite;

public class Soldat extends Unite {
	private static String name="Soldat"; //changer le static
	private int cpt;
	public Soldat( int dureeMobilisation, Etat etat) {
		super(100,50,dureeMobilisation, etat, name,1);
		
		//construction des prérequis pour cette unité
		super.prerequis.add(Prerequis.Caserne);
		
	}
	

	public String getString() {
		return name;
	}
	

}
