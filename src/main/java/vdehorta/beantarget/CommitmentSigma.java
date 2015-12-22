package vdehorta.beantarget;

/**
 * Information des engagements Sigma
 */
public class CommitmentSigma {

    /** Cout GRP N-1 */
    private Amount grpCostLastYear;

    /** Cout GRP N-1 non indicé */
    private Amount grpCostLastYearUncued;

    /** Cout GRP N-1 indicé N */
    private Amount grpCostLastYearCuedYear;

    /** Cout GRP N non indicé */
    private Amount grpCostYearUncued;

    /** Cout GRP N indicé N */
    private Amount grpCostYearCuedYear;

    /** Cout GRP N Accord non indicé */
    private Amount grpCostAgreementYearUncued;

    /** Cout GRP N objectif */
    private Amount grpCostObjYear;

    public Amount getGrpCostLastYear() {
        return grpCostLastYear;
    }

    public void setGrpCostLastYear(Amount grpCostLastYear) {
        this.grpCostLastYear = grpCostLastYear;
    }

    public Amount getGrpCostLastYearUncued() {
        return grpCostLastYearUncued;
    }

    public void setGrpCostLastYearUncued(Amount grpCostLastYearUncued) {
        this.grpCostLastYearUncued = grpCostLastYearUncued;
    }

    public Amount getGrpCostLastYearCuedYear() {
        return grpCostLastYearCuedYear;
    }

    public void setGrpCostLastYearCuedYear(Amount grpCostLastYearCuedYear) {
        this.grpCostLastYearCuedYear = grpCostLastYearCuedYear;
    }

    public Amount getGrpCostYearUncued() {
        return grpCostYearUncued;
    }

    public void setGrpCostYearUncued(Amount grpCostYearUncued) {
        this.grpCostYearUncued = grpCostYearUncued;
    }

    public Amount getGrpCostYearCuedYear() {
        return grpCostYearCuedYear;
    }

    public void setGrpCostYearCuedYear(Amount grpCostYearCuedYear) {
        this.grpCostYearCuedYear = grpCostYearCuedYear;
    }

    public Amount getGrpCostAgreementYearUncued() {
        return grpCostAgreementYearUncued;
    }

    public void setGrpCostAgreementYearUncued(Amount grpCostAgreementYearUncued) {
        this.grpCostAgreementYearUncued = grpCostAgreementYearUncued;
    }

    public Amount getGrpCostObjYear() {
        return grpCostObjYear;
    }

    public void setGrpCostObjYear(Amount grpCostObjYear) {
        this.grpCostObjYear = grpCostObjYear;
    }
}
