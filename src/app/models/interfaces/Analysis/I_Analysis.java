package app.models.interfaces.Analysis;

import app.models.interfaces.I_ModelEntryFactory;
import app.models.interfaces.I_ObservableDataAdaptor;
import app.models.interfaces.I_XMLExportable;
import app.models.interfaces.I_XMLImportable;

/**
 * Erstellt von Julius am 29/04/2017.
 */
public interface I_Analysis extends I_ModelEntryFactory<I_AnalysisEntry>, I_ObservableDataAdaptor<I_AnalysisEntry>, I_XMLExportable, I_XMLImportable {

}
