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
public interface IEtatJeu {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param v
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean setVersion(Integer v);

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
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addEntite(IEntite entite);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param list
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setListEntite(IEntite... list);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public IEntite getEntites();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param entite
	* @param nb
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean isPresent(String entite, Integer nb);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param entite
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean isDisponible(String entite);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public IEtatJeu getEtatJeu();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param entite
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer nbEntite(String entite);
}