/**
 * 
 */
package bo;

import java.util.Set;

import Interfaces.IBuildOrder;
import Interfaces.IObjectif;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author 3520096
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class BuildOrder implements IBuildOrder {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private EtatJeu partie;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Action> action;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Objectif objectif;
	@Override
	public void generer_BO(IObjectif objectif) {
		// TODO Module de remplacement de méthode auto-généré
		
	}
	@Override
	public void calculTemps() {
		// TODO Module de remplacement de méthode auto-généré
		
	}
	@Override
	public void afficher_BO() {
		// TODO Module de remplacement de méthode auto-généré
		
	}
	@Override
	public void estRealisable(IBuildOrder bo) {
		// TODO Module de remplacement de méthode auto-généré
		
	}
	@Override
	public void saisieBo(IBuildOrder bo) {
		// TODO Module de remplacement de méthode auto-généré
		
	}
	@Override
	public void enregistrementBo() {
		// TODO Module de remplacement de méthode auto-généré
		
	}
}