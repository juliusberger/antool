package app.models.interfaces.CostEstimation;

import app.models.interfaces.I_Clearable;

import java.util.List;

/**
 * Erstellt von Julius am 01/05/2017.
 */
public interface I_CostEstimation extends I_Clearable {
    List<I_CostEstimationEntry> getCostEstimationEntries();
}
