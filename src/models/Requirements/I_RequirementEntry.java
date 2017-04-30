package models.Requirements;

import javafx.beans.property.SimpleStringProperty;
import models.I_ModelPropertyAdaptor;

/**
 * Erstellt von Julius am 23/04/2017.
 */
public interface I_RequirementEntry extends I_ModelPropertyAdaptor {
    String getDescription();

    SimpleStringProperty descriptionProperty();

    void setDescription(String description);
}
