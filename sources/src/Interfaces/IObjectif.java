/**
 * 
 */
package Interfaces;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3520096
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IObjectif {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param po
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean setPieceOr(Integer po);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param food
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean setNourriture(Integer food);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param entite
	* @param quantite
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addEntite(String entite, Integer quantite);
}