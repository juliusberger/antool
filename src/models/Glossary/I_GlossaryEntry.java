package models.Glossary;

import javafx.beans.property.SimpleStringProperty;
import models.I_ModelPropertyAdaptor;

/**
 * Erstellt von Julius am 29/04/2017.
 */
public interface I_GlossaryEntry extends I_ModelPropertyAdaptor {
    String getItem();

    SimpleStringProperty itemProperty();

    void setItem(String item);

    String getDefinition();

    SimpleStringProperty definitionProperty();

    void setDefinition(String definition);
}
