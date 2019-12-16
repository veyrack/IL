package simulation;

import java.util.HashMap;
import Interfaces.IEntite;
import Interfaces.IObjectif;
import Interfaces.IStrategy;

public class Objectif implements IObjectif{
	private int or;
	private int nourriture;
	private HashMap<IEntite,Integer> hm;
	
	public Objectif(int or, int nourriture,HashMap<IEntite,Integer> hm) {
		this.or=or;
		this.nourriture=nourriture;
		this.hm=hm;
	}
	
	public int getOr() {
		return or;
	}
	public Integer getNourriture() {
		return nourriture;
	}
	
	@Override
	public HashMap<IEntite, Integer> getHashEntite() {
		return hm;
	}

	@Override
	public void setStragegy(IStrategy strategy) {
		// TODO Module de remplacement de méthode auto-généré
		
	}
	
}
