package vdehorta.beantarget;

import java.util.List;

/**
 * Tiers pouvant acheter de l'espace publicitaire
 */
public class Customer {

    // Fields

    /**
     * Code fonctionnel (identifiant adSales)
     */
    protected Integer code;

    protected List<SupportInvestment> supportInvestments;

    /**
     * Nom du client
     */
    protected String name;

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

    public List<SupportInvestment> getSupportInvestments() {
        return supportInvestments;
    }

    public void setSupportInvestments(List<SupportInvestment> supportInvestments) {
        this.supportInvestments = supportInvestments;
    }
}
