package models.implementation.ProjectData;

import javafx.beans.property.SimpleStringProperty;
import models.interfaces.ProjectData.I_Customer;
import models.interfaces.ProjectData.I_ProjectData;
import models.interfaces.ProjectData.I_ProjectEditor;

/**
 * Erstellt von Julius am 23/04/2017.
 */
public class ProjectData implements I_ProjectData {
    private final SimpleStringProperty _name = new SimpleStringProperty();
    private final SimpleStringProperty _dueDate = new SimpleStringProperty();

    private final I_ProjectEditor _projectEditor = new ProjectEditor();

    private final I_Customer _customer = new Customer();

    public ProjectData() {
    }

    @Override
    public String getName() {
        return this._name.get();
    }

    @Override
    public SimpleStringProperty nameProperty() {
        return this._name;
    }

    @Override
    public void setName(String name) {
        this._name.set(name);
    }

    @Override
    public String getDueDate() {
        return this._dueDate.get();
    }

    @Override
    public SimpleStringProperty dueDateProperty() {
        return this._dueDate;
    }

    @Override
    public void setDueDate(String dueDate) {
        this._dueDate.set(dueDate);
    }

    @Override
    public I_ProjectEditor getProjectEditor() {
        return this._projectEditor;
    }

    @Override
    public I_Customer getCustomer() {
        return this._customer;
    }
}