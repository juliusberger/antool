package models.Requirements;

import javafx.collections.ObservableList;
import models.I_ModelEntryFactory;
import models.I_ObservableDataAdaptor;

/**
 * Erstellt von Julius am 29/04/2017.
 */
public interface I_Comments extends I_ModelEntryFactory<I_CommentEntry>, I_ObservableDataAdaptor<I_CommentEntry> {
    ObservableList<I_CommentEntry> getEntries();
}
