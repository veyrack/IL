package test;


import java.util.HashMap;
import Interfaces.IBuildInterface;
import Interfaces.IBuildOrder;
import Interfaces.IEntite;
import Interfaces.IEtatJeu;
import Interfaces.IObjectif;
import construction.Etat;
import simulation.BuildOrder;
import simulation.BuildOrderBuilder;
import simulation.EtatJeu;
import simulation.Objectif;
import unites.Boss;

public class Test {

	public static void main(String[] args) {
		
		
		//Element de base 
		//HashMap<IEntite,Integer> base= new HashMap<>();
		//base.put(new Caserne(0, Etat.disponible), 1);
		//base.put(new Ouvrier(0,Etat.disponible), 5);
		
		//creation d'un soldat et d'une ferme
		
		HashMap<IEntite,Integer> li= new HashMap<>();
		
		li.put((IEntite) new Boss(0, Etat.Enconstruction),8);
		IEtatJeu jeu=new EtatJeu();
		IObjectif obj=new Objectif(20,20,li);
		IBuildOrder bo=new BuildOrder();
		IBuildInterface bob= new BuildOrderBuilder(obj,jeu,bo);
		
		//génerer le bo
		IBuildOrder nbo=bob.generer_BO(obj);
		nbo.afficherBO();

	}

}
