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
 * Erstellt von Julius am 23/04/2017.
 */
public class StateAnalysisController implements Initializable {

    public TableView<I_AnalysisEntry> stateAnalysisTable;

    public Button _addEntryButton;
    public Button _editEntryButton;
    public Button _deleteEntryButton;

    private final I_Analysis _data = Project.getInstance().getStateAnalysis();


    @Override
    public void initialize(URL location,
                           ResourceBundle resources) {


        I_TableBinding tableBinding = new TableBinding<>(stateAnalysisTable,
                _data);
        tableBinding.bindAll(_addEntryButton,
                _editEntryButton,
                _deleteEntryButton);

    }
}