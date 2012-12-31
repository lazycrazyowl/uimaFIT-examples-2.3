/* 
 Copyright 2009-2010	Regents of the University of Colorado.  
 All rights reserved. 

 Licensed under the Apache License, Version 2.0 (the "License"); 
 you may not use this file except in compliance with the License. 
 You may obtain a copy of the License at 

 http://www.apache.org/licenses/LICENSE-2.0 

 Unless required by applicable law or agreed to in writing, software 
 distributed under the License is distributed on an "AS IS" BASIS, 
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 See the License for the specific language governing permissions and 
 limitations under the License.
 */
package org.uimafit.examples.tf0054;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;
import org.uimafit.component.JCasAnnotator_ImplBase;
import org.uimafit.descriptor.ConfigurationParameter;
import org.uimafit.examples.tf0054.type.FirstCasType;

/**
 * @author Takeshi NAKANO
 * 
 * 1. Edit logic of annotator.
 * 2. Run Description writer (for making desc/abcAE.xml)
 * 3. if you change or create new cas type, edit src/main/resources/META-INF/org.uimafit/types.txt
 * 4. if you change or create new cas type, use Component Descriptor Editor to xyzType.xml and run jcasgen
 * 
 */
public class GetStartedQuickAE extends JCasAnnotator_ImplBase {

	public static final String PARAM_STRING = "stringParam";
	@ConfigurationParameter(name = PARAM_STRING)
	private String stringParam;

//	@ConfigurationParameter(name = "Patterns")
//	private Pattern[] mPatterns;

	@ConfigurationParameter(name = "Locations")
	private String[] mLocations;

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		System.out.println("Start: " + stringParam +" : "+ jCas.getDocumentText());

		String docText = jCas.getDocumentText();
		String regexp = "world";
		Pattern mPattern = Pattern.compile(regexp);
		// loop over patterns
		// found one - create annotation		
		FirstCasType annotation = new FirstCasType(jCas, 0, docText.length());
		Matcher matcher = mPattern.matcher(docText);
		while (matcher.find()) {
			annotation.setArgString(mLocations[0]+"("+matcher.start()+","+matcher.end()+")");
			//
			FirstCasType objFutureSt = new FirstCasType(jCas, matcher.start(), matcher.end());
			objFutureSt.addToIndexes();
			//
			Logger logger = getContext().getLogger();
			logger.log(Level.FINEST, "Found: " + annotation);
		}
		annotation.setArgInt((new Random()).nextInt(100));
		//
		annotation.addToIndexes();
		
		System.out.println("End: " + stringParam +" : "+ jCas.getSofaDataURI());
	}
}
