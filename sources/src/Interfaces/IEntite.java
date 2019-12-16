package Interfaces;

import construction.Entite;
import construction.Prerequis;

public interface IEntite {
	public Prerequis[] getPrerequis();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getName();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Strings
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Entite creationInstance(Object Strings);

	public Entite creationInstance(String n);

	public String getString();
}
