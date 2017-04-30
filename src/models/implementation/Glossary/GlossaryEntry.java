package models.implementation.Glossary;

import javafx.beans.property.SimpleStringProperty;
import models.interfaces.Glossary.I_GlossaryEntry;

import java.util.ArrayList;

/**
 * Erstellt von Julius am 24/04/2017.
 */
public class GlossaryEntry implements I_GlossaryEntry {
    private final SimpleStringProperty _item = new SimpleStringProperty();
    private final SimpleStringProperty _definition = new SimpleStringProperty();

    GlossaryEntry() {
    }

    @Override
    public String getItem() {
        return this._item.get();
    }

    @Override
    public SimpleStringProperty itemProperty() {
        return this._item;
    }

    @Override
    public void setItem(String item) {
        this._item.set(item);
    }

    @Override
    public String getDefinition() {
        return this._definition.get();
    }

    @Override
    public SimpleStringProperty definitionProperty() {
        return this._definition;
    }

    @Override
    public void setDefinition(String definition) {
        this._definition.set(definition);
    }

    @Override
    public void setAllProperties(ArrayList<String> propertyStrings) {
        try {
            this.setItem(propertyStrings.get(0));
            this.setDefinition(propertyStrings.get(1));
        } catch (IndexOutOfBoundsException ignored) {

        }
    }

    @Override
    public ArrayList<String> getAllProperties() {
        ArrayList<String> stringProperties = new ArrayList<>();
        stringProperties.add(this.getItem());
        stringProperties.add(this.getDefinition());

        return stringProperties;
    }
}