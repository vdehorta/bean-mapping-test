package vdehorta.beansource;

/**
 * Mode de vente
 */
public class SalesMode {

    /** Code provenant de AdSales */
    private Integer code = 87545;

    /** Nom du mode de vente */
    private String name = "544qsqsq";

    /** Nombre de jour avant achat */
    private Integer dayBeforePurchasing = 7531;

    /** Determine si le mode d'achat est utilisé pour les engagements sigma */
    private Boolean isSigma = null;

    /** Determine si le mode d'achat sera pris par defaut lors de la creation d'un engagement */
    private Boolean isDefault = true;

    /** Determine si le mode d'achat est utilisé pour la creation des engagements standard ou sigma */
    private Boolean isStandardCommitment = true;
    
    /** Determine si la création d'un pack sur ce mode d'achat est autorisée*/
    private Boolean isAllowedPack = true;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDayBeforePurchasing() {
        return dayBeforePurchasing;
    }

    public void setDayBeforePurchasing(Integer dayBeforePurchasing) {
        this.dayBeforePurchasing = dayBeforePurchasing;
    }

    public Boolean getIsSigma() {
        return isSigma;
    }

    public void setIsSigma(Boolean isSigma) {
        this.isSigma = isSigma;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsStandardCommitment() {
        return isStandardCommitment;
    }

    public void setIsStandardCommitment(Boolean isStandardCommitment) {
        this.isStandardCommitment = isStandardCommitment;
    }

    public Boolean getIsAllowedPack() {
        return isAllowedPack;
    }

    public void setIsAllowedPack(Boolean isAllowedPack) {
        this.isAllowedPack = isAllowedPack;
    }
}
