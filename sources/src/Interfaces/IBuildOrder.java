/**
 * 
 */
package Interfaces;

import java.util.HashMap;

import construction.Entite;
import simulation.BuildOrder;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3520096
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IBuildOrder {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param HashMapEntiteIntegerh
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addBuildOrder(HashMap<Entite, Integer> ent);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void afficherBO();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param bo
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public IBuildOrder optimiserBo(IBuildOrder bo);
}