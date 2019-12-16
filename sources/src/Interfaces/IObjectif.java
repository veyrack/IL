package Interfaces;

import java.util.HashMap;

import construction.Entite;

public interface IObjectif {
	public int getOr();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer getNourriture();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public HashMap<IEntite, Integer> getHashEntite();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param strategy
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStragegy(IStrategy strategy);

}
