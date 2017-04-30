package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Alle Klassen, die eine {@link ObservableList} des jeweiligen Typs halten, und Einträge dynamisch verwalten erben von dieser Klasse.
 * Nützlich ist dies in Verbindung mit der Verwendung von {@link javafx.scene.control.TableView}s über das {@link helpers.TableBinding}.
 */
public abstract class ObservableEntryHolder<S extends I_ModelPropertyAdaptor> implements I_ModelEntryFactory<S>, I_ObservableDataAdaptor<S> {
    /**
     * Für das in {@link javafx.scene.control.TableView}s eingesetzte Databinding wird die von JavaFX bereitgestellte observableArrayList verwendet.
     */
    private final ObservableList<S> _entries = FXCollections.observableArrayList();

    @Override
    public ObservableList<S> getEntries() {
        return this._entries;
    }

    @Override
    public void addAllProperties(ArrayList<String> dataStrings) {
        S entry = this.createEntry();
        entry.setAllProperties(dataStrings);

        this.getEntries().add(entry);
    }

    @Override
    public void setAllProperties(S entry,
                                 ArrayList<String> dataStrings) {
        entry.setAllProperties(dataStrings);
    }

    @Override
    public ArrayList<String> getAllProperties(S entry) {
        return entry.getAllProperties();
    }
}
