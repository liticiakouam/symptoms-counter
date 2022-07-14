package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
/**
 *
 * Va compté les symptoms à partir de la liste fournir par IsymptomReader
 * Après celà va rangé les symtoms par ordre alphabétique
 *
 */
public interface ISymptomsCount {
    /**
     * Initialisations d'une méthode abstraite qui prends en paramètre la liste des symptoms à compter
     *
     */
    Map<String, Integer> countSymptoms(List<String> symptoms);
}
