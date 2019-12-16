package simulation;

import java.util.HashMap;
import java.util.Map.Entry;

import batiments.Caserne;
import batiments.Centre;
import batiments.Ferme;
import batiments.Hall;
import construction.Entite;
import construction.Etat;
import construction.Prerequis;
import Interfaces.IEntite;
import Interfaces.IEtatJeu;
import unites.Ouvrier;

public class EtatJeu implements IEtatJeu{
	private int banque;
	private int nourriture;
	private String version;
	private HashMap<Entite,Integer> hm;


	
	public EtatJeu() { //Etat du jeu de base (Voir cachier des charges
		this.banque=50;
		this.nourriture=0;
		this.version="2.0";
		this.hm=new HashMap<>();
		hm.put(new Centre(0,Etat.Enconstruction), 1);
		hm.put(new Ouvrier(0,Etat.Enconstruction), 5);
		
	}
	
	public int getOr() {
		return banque;
	}
	@Override
	public Integer getNourriture() {
		return nourriture;
	}

	
	public String getVersion() {
		return version;
	}
	
	public HashMap<Entite,Integer> getHashMap(){
		return hm;
	}
	
	public void addInstance(Entite e) { //Construit notre Bo et Verifie pr�requis pour chaque build
		
		
		//Verification si l'entite est pas d�j� dans la liste et si elle est dispo
		
		if(e.getPrerequis()!=null) { //Si l'�lement � construire poss�de des pr�requis

			for(Prerequis p :e.getPrerequis()) {
				
				if(PrerequisToEntite(p)!=null) {//Si l'�lement pr�requis existe
					if(contains(PrerequisToEntite(p)))
						break;
					addInstance(PrerequisToEntite(p)); //recursion et ajout de l'entite requise
				}
			}
		}
		
		hm.put(e, recuperationCle(e));
		
		
	}

	private boolean contains(Entite e) {
		
		for ( Entry<Entite,Integer> entry :hm.entrySet()) {
		    Entite key = entry.getKey();
		    if(key.getName().equals(e.getName()))
				return true;
		}
		return false;
	}
	
	private int recuperationCle(Entite e) {
		
		for ( Entry<Entite,Integer> entry :hm.entrySet()) {
		    Entite key = entry.getKey();
		    if(key.getName().equals(e.getName()))
				return entry.getValue()+1;
		}
		return 1;
	}

	private Entite PrerequisToEntite(Prerequis p) { //Sert  � la construction du bo: voir methode build

		if(p==null)
			return null;
		switch (p) {
		case Centre:
			return new Centre(0, Etat.Enconstruction);
		case Ferme:
			return new Ferme(0,Etat.Enconstruction);
		case Caserne:
			return new Caserne(0,Etat.Enconstruction);
		case Hall:
			return new Hall(0,Etat.Enconstruction);
		case Ouvrier:
			return new Ouvrier(0,Etat.Enconstruction);
		default:
			return null; //N'arrive jamais normalement
		}
	}

	@Override
	public void addInstance(Object IEntitee) {
		// TODO Module de remplacement de méthode auto-généré
		
	}

	@Override
	public Boolean setVersion(String v) {
		this.version=v;
		return true;
	}

	@Override
	public Boolean setPO(Integer po) {
		this.banque=po;
		return true;
	}

	@Override
	public Boolean setNourriture(Integer n) {
		this.nourriture=n;
		return true;
	}

	@Override
	public void setListEntite(IEntite... list) {
		// TODO Module de remplacement de méthode auto-généré
		
	}

	@Override
	public void isDispo(String unit) {
		// TODO Module de remplacement de méthode auto-généré
		
	}

	@Override
	public void isPresent(String unit) {
		// TODO Module de remplacement de méthode auto-généré
		
	}

	@Override
	public void incrementeTime() {
		// TODO Module de remplacement de méthode auto-généré
		
	}

	
}
