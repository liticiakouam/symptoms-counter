package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
/**
 *
 * Méthode qui prends en paramètre une Map afin de récuperer les symptomes compté pour les
 * écrire dans le fichier
 *
 * */
public interface ISymptomWrite {
    void writeToFile(Map<String, Integer> symptomsWithOccurrences) throws IOException;
}
