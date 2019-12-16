package test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;

import batiments.Caserne;
import batiments.Centre;
import batiments.Hall;
import construction.Entite;
import construction.Etat;
import Interfaces.IEtatJeu;
import simulation.EtatJeu;
import unites.Boss;
import unites.Ouvrier;
import static org.junit.Assert.assertEquals;

public class TestEtatJeu {
	private IEtatJeu jeu=new EtatJeu();
	
	@Test
	public void addInstance() {
		
		//Le test de la methode "assInstance"
		jeu.addInstance((new Boss(0, Etat.Enconstruction)));

		//La liste qui doit �tre renvoy�
		ArrayList<String> listHash=new ArrayList<>();
		for(int i=0;i<5;i++)
			listHash.add((new Ouvrier(0, Etat.Enconstruction)).getName());
		listHash.add((new Centre(0, Etat.Enconstruction)).getName());
		listHash.add((new Hall(0, Etat.Enconstruction)).getName());
		listHash.add((new Boss(0, Etat.Enconstruction)).getName());
		listHash.add((new Caserne(0, Etat.Enconstruction)).getName());


		//jeu.getHashMap -> ListeJeu
		ArrayList<String> listJeu=new ArrayList<>();

		for ( Entry<Entite,Integer> entry :jeu.getHashMap().entrySet()) {
			Entite key = entry.getKey();
			for(int i=0;i<entry.getValue();i++)
				listJeu.add(key.getName());
		}

		//Trie pour la comparaison des map (sinon erreur car les listes n'ont pas les �lements dans le m�me ordre)
		Collections.sort(listJeu);
		Collections.sort(listHash);

		assertEquals(listJeu,listHash);

	}
}
