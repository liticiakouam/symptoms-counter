package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteSymptomDataToFile implements ISymptomWrite {
    private final String fileName;
    /**
     *
     * Déclaration d'un constructeur qui prends en paramètre un string qui est
     * le chemin du fichier vers lequel il faut écrire le resultat
     *
     * */
    public WriteSymptomDataToFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeToFile(Map<String, Integer> symptomsWithOccurrences) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        /**
         *
         * Uitlisation d'une liste set qui recupère les symptomes et leurs nombres d'occurrences et les classes sans redondance
         *
         * */
        Set<Map.Entry<String, Integer>> entries = symptomsWithOccurrences.entrySet();
        for (Map.Entry<String, Integer> symptomEntry : entries) {
            //getKey permet de récuperer la clé qui est le symptom
            String symptom = symptomEntry.getKey();
            int occurrences = symptomEntry.getValue();
            writer.write(symptom + " = " + occurrences + "\n");
        }
        writer.close();
    }
}
