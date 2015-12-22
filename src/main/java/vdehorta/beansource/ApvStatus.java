package vdehorta.beansource;

/**
 * Cette classe défini un status pour une version d'une simulation.
 */
public class ApvStatus {

    // Fields
    /** code technique du status */
    private String code = "gfggffgf";

    /** nom du status */
    private String name = "gfgfgfgfg";

    /** ordre d'affichage du status */
    private Integer rank = 4554;

    /** indique si le suivi actif doit etre passé à vrai */
    private boolean automaticActiveMonitoring = true;

    /** Indique si le statut peut passer en version courante */
    private boolean enableToChangeForCurrentVersion = true;

    /** Le statut fait parti la liste des statuts exclusifs */
    private boolean exclusifSelection = true;

    /** Le premier status par défaut */
    private boolean firstValueApv = true;

    /** Indique si le statut est supprimable */
    private boolean suppressible = true;

    /** Indique si le statut est supprimable */
    private boolean finalizable = true;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public boolean isAutomaticActiveMonitoring() {
        return automaticActiveMonitoring;
    }

    public void setAutomaticActiveMonitoring(boolean automaticActiveMonitoring) {
        this.automaticActiveMonitoring = automaticActiveMonitoring;
    }

    public boolean isEnableToChangeForCurrentVersion() {
        return enableToChangeForCurrentVersion;
    }

    public void setEnableToChangeForCurrentVersion(boolean enableToChangeForCurrentVersion) {
        this.enableToChangeForCurrentVersion = enableToChangeForCurrentVersion;
    }

    public boolean isExclusifSelection() {
        return exclusifSelection;
    }

    public void setExclusifSelection(boolean exclusifSelection) {
        this.exclusifSelection = exclusifSelection;
    }

    public boolean isFirstValueApv() {
        return firstValueApv;
    }

    public void setFirstValueApv(boolean firstValueApv) {
        this.firstValueApv = firstValueApv;
    }

    public boolean isSuppressible() {
        return suppressible;
    }

    public void setSuppressible(boolean suppressible) {
        this.suppressible = suppressible;
    }

    public boolean isFinalizable() {
        return finalizable;
    }

    public void setFinalizable(boolean finalizable) {
        this.finalizable = finalizable;
    }
}
