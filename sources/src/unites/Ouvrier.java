package unites;

import construction.Etat;
import construction.Prerequis;
import construction.Unite;

public class Ouvrier extends Unite{
	private static String name="Ouvrier"; //changer le statc
	private int fournit=0;
	private static int i; //Ouvrier1, Ouvrier2 etc..
	
	public Ouvrier( int dureeMobilisation, Etat etat) {
		super(50, 30, dureeMobilisation, etat,name,3);
		//construction des pr�requis pour cette unit�
		super.prerequis.add(Prerequis.Centre);
		
		i++;
				
	}
	
	
	private void fournitSecondes() { //Peut-�tre inutile pour l'impl�mentation qu'on fait dans cette UE
		fournit=fournit++;
	}
	
	public String getString() {
		return name;
	}
}
