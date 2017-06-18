package app.models.interfaces.Requirements;

import app.models.interfaces.*;
import javafx.collections.ObservableList;

/**
 * Erstellt von Julius am 29/04/2017.
 */
public interface I_Comments extends I_ModelEntryFactory<I_CommentEntry>, I_ObservableDataAdaptor<I_CommentEntry>, I_XmlModelEntity, I_Clearable {
    ObservableList<I_CommentEntry> getEntries();
}
