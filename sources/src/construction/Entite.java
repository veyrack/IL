package construction;

import java.util.ArrayList;

public class Entite {
	protected int count;
	protected int tpsCstr;
	protected int dureeMobilisation;
	protected Etat etat;
	protected String name;
	protected ArrayList<Prerequis> prerequis=new ArrayList<>();
	
	public Entite(int count,int tpsCstr,int dureeMobilisation,Etat etat,String name) {
		this.count=count;
		this.tpsCstr=tpsCstr;
		this.dureeMobilisation=dureeMobilisation;
		this.etat=etat;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTpsCstr() {
		return tpsCstr;
	}
	
	public ArrayList<Prerequis> getPrerequis() {
		return prerequis;
	}
	
	
	
	
}
