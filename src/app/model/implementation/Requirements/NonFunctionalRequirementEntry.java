package app.model.implementation.Requirements;

import app.model.interfaces.I_XmlModelEntity;
import app.model.interfaces.Requirements.I_NonFunctionalRequirementEntry;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Model-Implementierung von {@link I_NonFunctionalRequirementEntry}
 */
public class NonFunctionalRequirementEntry implements I_NonFunctionalRequirementEntry {
    private final SimpleStringProperty _businessProcess = new SimpleStringProperty("");
    private final SimpleStringProperty _description = new SimpleStringProperty("");

    NonFunctionalRequirementEntry() {
    }

    @Override
    public String getBusinessProcess() {
        return _businessProcess.get();
    }

    @Override
    public void setBusinessProcess(String businessProcess) {
        _businessProcess.set(businessProcess);
    }

    @Override
    public SimpleStringProperty businessProcessProperty() {
        return _businessProcess;
    }

    @Override
    public String getDescription() {
        return _description.get();
    }

    @Override
    public void setDescription(String description) {
        _description.set(description);
    }

    @Override
    public SimpleStringProperty descriptionProperty() {
        return _description;
    }

    @Override
    public List<I_XmlModelEntity> getChildren() {
        return null;
    }

    @Override
    public void addEntryWithProperties(ArrayList<String> properties) {

    }

    @Override
    public String getTag() {
        return "NonFunctionalRequirementsEntry";
    }

    @Override
    public ArrayList<String> getAllProperties() {
        ArrayList<String> stringProperties = new ArrayList<>();
        stringProperties.add(getBusinessProcess());
        stringProperties.add(getDescription());

        return stringProperties;
    }

    @Override
    public void setAllProperties(ArrayList<String> propertyStrings) {
        try {
            setBusinessProcess(propertyStrings.get(0));
            setDescription(propertyStrings.get(1));
        } catch (IndexOutOfBoundsException ignored) {

        }
    }
}
