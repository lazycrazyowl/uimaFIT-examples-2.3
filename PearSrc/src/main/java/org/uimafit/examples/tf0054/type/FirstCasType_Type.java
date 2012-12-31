
/* First created by JCasGen Tue Jan 01 01:03:00 JST 2013 */
package org.uimafit.examples.tf0054.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Jan 01 01:06:21 JST 2013
 * @generated */
public class FirstCasType_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (FirstCasType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = FirstCasType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new FirstCasType(addr, FirstCasType_Type.this);
  			   FirstCasType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new FirstCasType(addr, FirstCasType_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FirstCasType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.uimafit.examples.tf0054.type.FirstCasType");
 
  /** @generated */
  final Feature casFeat_argString;
  /** @generated */
  final int     casFeatCode_argString;
  /** @generated */ 
  public String getArgString(int addr) {
        if (featOkTst && casFeat_argString == null)
      jcas.throwFeatMissing("argString", "org.uimafit.examples.tf0054.type.FirstCasType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_argString);
  }
  /** @generated */    
  public void setArgString(int addr, String v) {
        if (featOkTst && casFeat_argString == null)
      jcas.throwFeatMissing("argString", "org.uimafit.examples.tf0054.type.FirstCasType");
    ll_cas.ll_setStringValue(addr, casFeatCode_argString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_argInt;
  /** @generated */
  final int     casFeatCode_argInt;
  /** @generated */ 
  public int getArgInt(int addr) {
        if (featOkTst && casFeat_argInt == null)
      jcas.throwFeatMissing("argInt", "org.uimafit.examples.tf0054.type.FirstCasType");
    return ll_cas.ll_getIntValue(addr, casFeatCode_argInt);
  }
  /** @generated */    
  public void setArgInt(int addr, int v) {
        if (featOkTst && casFeat_argInt == null)
      jcas.throwFeatMissing("argInt", "org.uimafit.examples.tf0054.type.FirstCasType");
    ll_cas.ll_setIntValue(addr, casFeatCode_argInt, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public FirstCasType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_argString = jcas.getRequiredFeatureDE(casType, "argString", "uima.cas.String", featOkTst);
    casFeatCode_argString  = (null == casFeat_argString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_argString).getCode();

 
    casFeat_argInt = jcas.getRequiredFeatureDE(casType, "argInt", "uima.cas.Integer", featOkTst);
    casFeatCode_argInt  = (null == casFeat_argInt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_argInt).getCode();

  }
}



    