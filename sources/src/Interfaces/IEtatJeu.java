package Interfaces;

import java.util.HashMap;

import construction.Entite;
import construction.Prerequis;

public interface IEtatJeu {
	public int getOr();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer getNourriture();

	public String getVersion();

	public HashMap<Entite, Integer> getHashMap();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param IEntitee
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addInstance(Object IEntitee);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param v
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean setVersion(String v);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param po
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean setPO(Integer po);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param n
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean setNourriture(Integer n);

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
	* @param unit
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void isDispo(String unit);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param unit
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void isPresent(String unit);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void incrementeTime();

}
