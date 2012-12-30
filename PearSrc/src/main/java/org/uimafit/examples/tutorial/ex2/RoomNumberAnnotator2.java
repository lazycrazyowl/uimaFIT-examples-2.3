/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.uimafit.examples.tutorial.ex2;

import java.util.Random;
import java.util.Collection;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;
import org.uimafit.component.JCasAnnotator_ImplBase;
import org.uimafit.descriptor.TypeCapability;
import org.uimafit.examples.tutorial.type.RoomNumber;
import org.uimafit.util.JCasUtil;

@TypeCapability(outputs = { "org.apache.uima.tutorial.RoomNumber", "org.apache.uima.tutorial.RoomNumber:building" })
public class RoomNumberAnnotator2 extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		//AnnotationIndex<RoomNumber> a = aJCas.getAnnotationIndex(<RoomNumber>);
		Collection<RoomNumber> rooms = JCasUtil.select(aJCas, RoomNumber.class);
		
		for(RoomNumber c : rooms){
			c.setIds((new Random()).nextInt(100));
			Logger logger = getContext().getLogger();
			logger.log(Level.FINEST, "Found: " + c);
		}
	}
}
