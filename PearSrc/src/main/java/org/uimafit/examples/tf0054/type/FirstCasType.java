

/* First created by JCasGen Tue Jan 01 01:03:00 JST 2013 */
package org.uimafit.examples.tf0054.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Jan 01 01:06:21 JST 2013
 * XML source: /Users/tf0054/Documents/workspace2/uimaFIT-examples-2.3/PearSrc/src/main/resources/org/uimafit/examples/tf0054/type/FirstCasType.xml
 * @generated */
public class FirstCasType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FirstCasType.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected FirstCasType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public FirstCasType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public FirstCasType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public FirstCasType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: argString

  /** getter for argString - gets build. name
   * @generated */
  public String getArgString() {
    if (FirstCasType_Type.featOkTst && ((FirstCasType_Type)jcasType).casFeat_argString == null)
      jcasType.jcas.throwFeatMissing("argString", "org.uimafit.examples.tf0054.type.FirstCasType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FirstCasType_Type)jcasType).casFeatCode_argString);}
    
  /** setter for argString - sets build. name 
   * @generated */
  public void setArgString(String v) {
    if (FirstCasType_Type.featOkTst && ((FirstCasType_Type)jcasType).casFeat_argString == null)
      jcasType.jcas.throwFeatMissing("argString", "org.uimafit.examples.tf0054.type.FirstCasType");
    jcasType.ll_cas.ll_setStringValue(addr, ((FirstCasType_Type)jcasType).casFeatCode_argString, v);}    
   
    
  //*--------------*
  //* Feature: argInt

  /** getter for argInt - gets test add
   * @generated */
  public int getArgInt() {
    if (FirstCasType_Type.featOkTst && ((FirstCasType_Type)jcasType).casFeat_argInt == null)
      jcasType.jcas.throwFeatMissing("argInt", "org.uimafit.examples.tf0054.type.FirstCasType");
    return jcasType.ll_cas.ll_getIntValue(addr, ((FirstCasType_Type)jcasType).casFeatCode_argInt);}
    
  /** setter for argInt - sets test add 
   * @generated */
  public void setArgInt(int v) {
    if (FirstCasType_Type.featOkTst && ((FirstCasType_Type)jcasType).casFeat_argInt == null)
      jcasType.jcas.throwFeatMissing("argInt", "org.uimafit.examples.tf0054.type.FirstCasType");
    jcasType.ll_cas.ll_setIntValue(addr, ((FirstCasType_Type)jcasType).casFeatCode_argInt, v);}    
  }

    