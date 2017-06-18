package app.models.interfaces.Requirements;

import app.models.interfaces.I_XmlModelEntity;

/**
 * Erstellt von Julius am 29/04/2017.
 */
public interface I_QualityRequirementEntry extends I_XmlModelEntity {
    Priority getPriority();

    void setPriority(Priority priority);

    enum Priority {
        HIGH, MEDIUM, LOW, IRRELEVANT
    }
}
