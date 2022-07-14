package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter implements ISymptomsCount {
	@Override
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		/**
		 * Utilisation d'une collection TreeMap qui va permettre de ranger automatiquement par ordre alphabétique
		 * */
		Map<String, Integer> symptomsMap = new TreeMap<>();
		for (String symptom : symptoms) {
			if(symptomsMap.containsKey(symptom)) {
				int occurrences = symptomsMap.get(symptom);
				occurrences++;
				symptomsMap.put(symptom, occurrences);
			} else {
				symptomsMap.put(symptom, 1);
			}
		}
		return symptomsMap;
	}
}


	/*ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
	List<String> symptoms = symptomReader.getSymptoms();
    @Override
    public Map<String, Integer> countSymptoms() {
        Map<String, Integer> symptomsMap = new TreeMap<>();
		for (String symptom : symptoms) {
			if(symptomsMap.containsKey(symptom)) {
				int occurrences = symptomsMap.get(symptom);
				occurrences++;
				symptomsMap.put(symptom, occurrences);
			} else {
				symptomsMap.put(symptom, 1);
			}
		}
		return symptomsMap;
    }*/

