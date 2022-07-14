package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	//lecture des symptomes
	ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
	List<String> symptoms = symptomReader.getSymptoms();

}
