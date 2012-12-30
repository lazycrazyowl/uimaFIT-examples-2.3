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
package org.uimafit.examples.tutorial.ex2;

import static org.uimafit.factory.AnalysisEngineFactory.createPrimitive;
import static org.uimafit.util.JCasUtil.select;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReader;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.uimafit.factory.AnalysisEngineFactory;
import org.uimafit.factory.CollectionReaderFactory;
import org.uimafit.factory.TypeSystemDescriptionFactory;
import org.uimafit.pipeline.SimplePipeline;

import org.uimafit.component.xwriter.CASDumpWriter;
import org.uimafit.examples.tf0054.LineReader;
import org.uimafit.examples.tutorial.type.RoomNumber;
import org.xml.sax.SAXException;

import org.apache.uima.annotator.WhitespaceTokenizer;

/**
 * 
 * @author Philip Ogren
 * 
 */
public class RoomNumberAnnotatorPipeline {

	public static void main(String[] args) throws UIMAException {
		//AnalysisEngine analysisEngine0 = createPrimitive(WhitespaceTokenizer.class);
		AnalysisEngine analysisEngine = createPrimitive(RoomNumberAnnotator.class, "Patterns",
				new String[] { "\\b[0-4]\\d-[0-2]\\d\\d\\b", "\\b[G1-4][NS]-[A-Z]\\d\\d\\b" },
				"Locations", new String[] { "Downtown", "Uptown" });

		AnalysisEngine analysisEngine2 = createPrimitive(RoomNumberAnnotator2.class);
		AnalysisEngine analysisEngine3 = createPrimitive(RoomNumberAnnotator3.class);
		
		AnalysisEngine objWriter = createPrimitive(CASDumpWriter.class,
				CASDumpWriter.PARAM_OUTPUT_FILE, "output.txt");

//		AnalysisEngineDescription seg =  AnalysisEngineFactory.createPrimitiveDescription(CASDumpWriter.class);
//		try {
//			seg.toXML(new FileOutputStream("CASDumpWriter.xml"));
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SAXException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		TypeSystemDescription typeSystem = TypeSystemDescriptionFactory
				.createTypeSystemDescription();

		// The lineReader simply copies the lines from the input file into the
		// default view - one line per CAS
		String strFileName = "src/main/resources/org/uimafit/examples/tf0054/test.txt";
		CollectionReader lineReader = CollectionReaderFactory.createCollectionReader(
				LineReader.class, typeSystem, LineReader.PARAM_INPUT_FILE, strFileName);

		try {
			//SimplePipeline.runPipeline(jCas, analysisEngine, analysisEngine2);
			SimplePipeline.runPipeline(lineReader, analysisEngine, analysisEngine2, analysisEngine3, objWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
