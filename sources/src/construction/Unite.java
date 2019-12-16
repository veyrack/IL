package construction;

public class Unite extends Entite{
	protected int countN;
	
	
	public Unite(int count, int tpsCstr, int dureeMobilisation, Etat etat, String name,int countN) {
		super(count, tpsCstr, dureeMobilisation, etat, name);
		this.countN=countN;
		
	}
	
	
	
}
