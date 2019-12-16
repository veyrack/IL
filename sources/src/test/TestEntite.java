package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;


import batiments.Caserne;
import batiments.Centre;
import batiments.Ferme;
import batiments.Hall;
import construction.Entite;
import construction.Etat;
import construction.Prerequis;
import unites.Boss;
import unites.Ouvrier;
import unites.Soldat;

public class TestEntite {
	
	
	@Test
	public void getPrerequis(){
		assertEquals(Arrays.asList(Prerequis.Hall,Prerequis.Caserne),(new Boss(0,Etat.Enconstruction)).getPrerequis());
		assertEquals(Arrays.asList(Prerequis.Caserne),(new Soldat(0,Etat.Enconstruction)).getPrerequis());
		assertEquals(Arrays.asList(Prerequis.Centre),(new Ouvrier(0,Etat.Enconstruction)).getPrerequis());
		assertEquals(Arrays.asList(Prerequis.Ouvrier,Prerequis.Ferme),(new Caserne(0,Etat.Enconstruction)).getPrerequis());
		assertEquals(Arrays.asList(Prerequis.Ouvrier),(new Centre(0,Etat.Enconstruction)).getPrerequis());
		assertEquals(Arrays.asList(),(new Ferme(0,Etat.Enconstruction)).getPrerequis());
		assertEquals(Arrays.asList(Prerequis.Ouvrier,Prerequis.Caserne),(new Hall(0,Etat.Enconstruction)).getPrerequis());
	}
	
	@Test
	public void creationInstance() {
		Entite e= new Boss(0,Etat.Enconstruction);
		assertEquals(e.getName(), "Boss");
		Entite e1= new Soldat(0,Etat.Enconstruction);
		assertEquals(e1.getName(), "Soldat");
		Entite e2= new Ouvrier(0,Etat.Enconstruction);
		assertEquals(e2.getName(), "Ouvrier");
		Entite e3= new Caserne(0,Etat.Enconstruction);
		assertEquals(e3.getName(), "Caserne");
		Entite e4= new Centre(0,Etat.Enconstruction);
		assertEquals(e4.getName(), "Centre");
		Entite e5= new Ferme(0,Etat.Enconstruction);
		assertEquals(e5.getName(), "Ferme");
		Entite e6= new Hall(0,Etat.Enconstruction);
		assertEquals(e6.getName(), "Hall");
		
	}

}
