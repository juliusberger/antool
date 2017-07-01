package app.controller;

import app.helpers.I_TableBinding;
import app.helpers.TableBinding;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import app.model.implementation.Project;
import app.model.interfaces.Analysis.I_Analysis;
import app.model.interfaces.Analysis.I_AnalysisEntry;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller für die Ist-Analyse (view/stateAnalysis.fxml)
 * Es wird das Model {@link I_Analysis} an die Tabelle gebunden, um die Einträge des Typs {@link I_AnalysisEntry} zu verwalten.
 */
public class StateAnalysisController implements Initializable {

    public TableView<I_AnalysisEntry> _stateAnalysisTable;

    public Button _addEntryButton;
    public Button _editEntryButton;
    public Button _deleteEntryButton;

    private final I_Analysis _dataModel = Project.getInstance().getStateAnalysis();

    /**
     * Bindet die Tabelle an die Repräsentationen der Einträge des Typs {@link I_AnalysisEntry} im Model.
     * Für mehr Informationen zur Bindung eines Models an eine Tabelle, siehe {@link TableBinding}.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        I_TableBinding tableBinding = new TableBinding<>(_stateAnalysisTable, _dataModel);
        tableBinding.bindAll(_addEntryButton, _editEntryButton, _deleteEntryButton);
    }
}
