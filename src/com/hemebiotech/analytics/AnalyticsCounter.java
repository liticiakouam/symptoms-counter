package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	//lecture des symptomes
	ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
	List<String> symptoms = symptomReader.getSymptoms();

	//comptage du nombre d'occurrences de chaque symptome
	ISymptomsCount counter = new SymptomsCounter();
	Map<String, Integer> symptomsWithOccurrences = counter.countSymptoms(symptoms);
}
