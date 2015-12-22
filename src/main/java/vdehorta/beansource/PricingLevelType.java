package vdehorta.beansource;

/**
 * Niveau Tarifaire Type : élément du meta-schéma de calcul permettant de
 */
public class PricingLevelType {

    private Integer rank = 666;

    private Integer rankDisplay = 5454545;

    private String name = "dffdfdfd";

    private String code = "dffgfgf";

    private boolean briefable = true;

    private boolean visible = false;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getRankDisplay() {
        return rankDisplay;
    }

    public void setRankDisplay(Integer rankDisplay) {
        this.rankDisplay = rankDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isBriefable() {
        return briefable;
    }

    public void setBriefable(boolean briefable) {
        this.briefable = briefable;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

