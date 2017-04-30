package models.implementation.ProjectData;

import javafx.beans.property.SimpleStringProperty;
import models.interfaces.ProjectData.I_Customer;

/**
 * Erstellt von Julius am 23/04/2017.
 */
class Customer implements I_Customer {
    private final SimpleStringProperty _surname = new SimpleStringProperty();
    private final SimpleStringProperty _name = new SimpleStringProperty();
    private final SimpleStringProperty _telephone = new SimpleStringProperty();
    private final SimpleStringProperty _email = new SimpleStringProperty();

    private final SimpleStringProperty _companyName = new SimpleStringProperty();
    private final SimpleStringProperty _companyStreet = new SimpleStringProperty();
    private final SimpleStringProperty _companyPLZ = new SimpleStringProperty();
    private final SimpleStringProperty _companyLocation = new SimpleStringProperty();

    Customer() {
    }

    @Override
    public String getSurname() {
        return this._surname.get();
    }

    @Override
    public SimpleStringProperty surnameProperty() {
        return this._surname;
    }

    public void setSurname(String surname) {
        this._surname.set(surname);
    }

    @Override
    public String getName() {
        return this._name.get();
    }

    @Override
    public SimpleStringProperty nameProperty() {
        return this._name;
    }

    public void setName(String name) {
        this._name.set(name);
    }

    @Override
    public String getTelephone() {
        return this._telephone.get();
    }

    @Override
    public SimpleStringProperty telephoneProperty() {
        return this._telephone;
    }

    public void setTelephone(String telephone) {
        this._telephone.set(telephone);
    }

    @Override
    public String getEmail() {
        return this._email.get();
    }

    @Override
    public SimpleStringProperty emailProperty() {
        return this._email;
    }

    public void setEmail(String email) {
        this._email.set(email);
    }

    @Override
    public String getCompanyName() {
        return this._companyName.get();
    }

    @Override
    public SimpleStringProperty companyNameProperty() {
        return this._companyName;
    }

    public void setCompanyName(String companyName) {
        this._companyName.set(companyName);
    }

    @Override
    public String getCompanyStreet() {
        return this._companyStreet.get();
    }

    @Override
    public SimpleStringProperty companyStreetProperty() {
        return this._companyStreet;
    }

    public void setCompanyStreet(String companyStreet) {
        this._companyStreet.set(companyStreet);
    }

    @Override
    public String getCompanyPLZ() {
        return this._companyPLZ.get();
    }

    @Override
    public SimpleStringProperty companyPLZProperty() {
        return this._companyPLZ;
    }

    public void setCompanyPLZ(String companyPLZ) {
        this._companyPLZ.set(companyPLZ);
    }

    @Override
    public String getCompanyLocation() {
        return this._companyLocation.get();
    }

    @Override
    public SimpleStringProperty companyLocationProperty() {
        return this._companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this._companyLocation.set(companyLocation);
    }
}