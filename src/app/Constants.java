package app;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Repräsentiert unspezifische Konstanten, die überall im Projekt verwendet werden.
 */
public final class Constants {

    /**
     * Benutzt als gemeinsame Fenstertitel.
     */
    public static final String CONTEXT_TITLE_COMMON = "ANTool";
    public static final String CONTEXT_TITLE_XML_EXPORT = "XML-Export";
    public static final String CONTEXT_TITLE_XML_IMPORT = "XML-Import";
    public static final String CONTEXT_TITLE_ERROR = "Fehler";
    public static final String CONTEXT_MSG_UNSAVED_CHANGES = "Alle nicht gespeicherten Änderungen gehen verloren. Fortfahren?";
    /**
     * XML-Tag-Names für Import und Export
     */
    public static final String XML_PROPERTIES_TAG = "Properties";
    public static final String XML_PROPERTY_TAG = "Property";
    public static final String XML_CHILDREN_TAG = "Children";
    /**
     * Übersetzung der berechneten Function Points in MannMonate. Tabelle gemäß IBM
     */
    public static final NavigableMap<Integer, Integer> FUNCTION_POINTS_MEN_MONTHS_CORRELATION = new TreeMap<>();

    static {
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2900, 341);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2800, 307);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2700, 284);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2600, 263);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2500, 245);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2400, 230);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2300, 215);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2200, 201);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2100, 188);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(2000, 175);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1900, 164);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1800, 153);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1700, 142);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1600, 132);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1500, 122);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1400, 112);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1300, 103);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1200, 94);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1100, 85);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(1000, 76);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(950, 72);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(900, 68);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(850, 64);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(800, 60);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(750, 56);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(700, 52);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(650, 48);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(600, 44);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(550, 40);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(500, 36);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(450, 32);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(400, 28);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(350, 24);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(300, 20);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(250, 17);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(200, 14);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(150, 11);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(100, 8);
        FUNCTION_POINTS_MEN_MONTHS_CORRELATION.put(50, 5);
    }

    /**
     * Utility-Klasse, soll nicht instanziiert werden.
     */
    private Constants() {
    }
}
