package simulation;

import java.util.Map.Entry;

import Interfaces.IBuildInterface;
import Interfaces.IBuildOrder;
import Interfaces.IEntite;
import Interfaces.IEtatJeu;
import Interfaces.IObjectif;
import Interfaces.IStrategy;
import construction.Entite;

public class BuildOrderBuilder implements IBuildInterface{
	private IEtatJeu jeu;
	private IBuildOrder bo;
	
	public BuildOrderBuilder(IObjectif o,IEtatJeu jeu,IBuildOrder bo) {
		this.jeu=jeu;
		this.bo=bo;
	}
	
	public IBuildOrder generer_BO(IObjectif o) {
		if(estRealisable()) {

			for(Entry<IEntite, Integer> entry : o.getHashEntite().entrySet()) {
				IEntite clef = entry.getKey();
				for(int j=0;j<entry.getValue();j++)
					jeu.addInstance(clef);

			}
		}
		bo.addBuildOrder(jeu.getHashMap());
		return bo;
	}

	
	public boolean estRealisable() { //Tester si Or et nourriture suffisant lors de la creation des unit�s
		return true; //Tous le temps vrai pour test simple de la creation d'un BO
	}
	
	public IBuildOrder soumettreBo(IBuildOrder bo) { //Non fonctionnel car pas besoin pour les test d'int�gration
		IBuildOrder newBo=new BuildOrder();
		if(estRealisable())
			newBo=bo;
		else 
			newBo=newBo.optimiserBo(bo);
		
		return bo;
			
	}

	@Override
	public Boolean setObjectif(IObjectif obj) {
		// TODO Module de remplacement de méthode auto-généré
		return null;
	}

	@Override
	public IObjectif getObjectif() {
		// TODO Module de remplacement de méthode auto-généré
		return null;
	}

	@Override
	public Boolean setStrategy(IStrategy strat) {
		// TODO Module de remplacement de méthode auto-généré
		return null;
	}

	@Override
	public IStrategy getStrategy() {
		// TODO Module de remplacement de méthode auto-généré
		return null;
	}



	
	
}
