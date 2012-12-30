
/* First created by JCasGen Mon Mar 29 06:42:24 MDT 2010 */
package org.uimafit.examples.tutorial.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;

/** 
 * Updated by JCasGen Sun Dec 16 15:42:15 JST 2012
 * XML source: /Users/tf0054/Documents/workspace2/uimaFIT-examples/src/main/resources/org/uimafit/examples/tutorial/type/RoomNumber.xml
 * @generated */
public class RoomNumber extends Annotation {
	/**
	 * @generated
	 * @ordered
	 */
	public final static int typeIndexID = JCasRegistry.register(RoomNumber.class);

	/**
	 * @generated
	 * @ordered
	 */
	public final static int type = typeIndexID;

	/** @generated */
	public int getTypeIndexID() {return typeIndexID;}
 
	/**
	 * Never called. Disable default constructor
	 * 
	 * @generated
	 */
	protected RoomNumber() {/* intentionally empty block */}
    
	/**
	 * Internal - constructor used by generator
	 * 
	 * @generated
	 */
	public RoomNumber(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
	/** @generated */
	public RoomNumber(JCas jcas) {
    super(jcas);
    readObject();   
  } 

	/** @generated */
	public RoomNumber(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

	/**
	 * <!-- begin-user-doc --> Write your own initialization here <!--
	 * end-user-doc -->
	 * 
	 * @generated modifiable
	 */
	private void readObject() {
	}

	// *--------------*
	// * Feature: building

	/**
	 * getter for building - gets
	 * 
	 * @generated
	 */
	public String getBuilding() {
    if (RoomNumber_Type.featOkTst && ((RoomNumber_Type)jcasType).casFeat_building == null)
      jcasType.jcas.throwFeatMissing("building", "org.uimafit.examples.tutorial.type.RoomNumber");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RoomNumber_Type)jcasType).casFeatCode_building);}
    
	/**
	 * setter for building - sets
	 * 
	 * @generated
	 */
	public void setBuilding(String v) {
    if (RoomNumber_Type.featOkTst && ((RoomNumber_Type)jcasType).casFeat_building == null)
      jcasType.jcas.throwFeatMissing("building", "org.uimafit.examples.tutorial.type.RoomNumber");
    jcasType.ll_cas.ll_setStringValue(addr, ((RoomNumber_Type)jcasType).casFeatCode_building, v);}    
   
    
  //*--------------*
  //* Feature: ids

  /** getter for ids - gets test add
   * @generated */
  public int getIds() {
    if (RoomNumber_Type.featOkTst && ((RoomNumber_Type)jcasType).casFeat_ids == null)
      jcasType.jcas.throwFeatMissing("ids", "org.uimafit.examples.tutorial.type.RoomNumber");
    return jcasType.ll_cas.ll_getIntValue(addr, ((RoomNumber_Type)jcasType).casFeatCode_ids);}
    
  /** setter for ids - sets test add 
   * @generated */
  public void setIds(int v) {
    if (RoomNumber_Type.featOkTst && ((RoomNumber_Type)jcasType).casFeat_ids == null)
      jcasType.jcas.throwFeatMissing("ids", "org.uimafit.examples.tutorial.type.RoomNumber");
    jcasType.ll_cas.ll_setIntValue(addr, ((RoomNumber_Type)jcasType).casFeatCode_ids, v);}    
  }
