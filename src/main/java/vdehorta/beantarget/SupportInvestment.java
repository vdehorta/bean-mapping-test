package vdehorta.beantarget;

import java.util.List;

/**
 * Investissement sur un groupe de supports défini au cours du brief
 */
public class SupportInvestment {

    /**
     * Identifiant technique
     */
    private Integer id;

    /**
     * Support sur lequel porte cet investissement
     */
    private List<Support> supports;

    /**
     * Valeur de l'investissement
     */
    private Amount amount;

    /**
     * produit commercial
     */
    private CommercialProduct commercialProduct;

    /**
     * mode d'achat
     */
    private SalesMode salesMode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Support> getSupports() {
        return supports;
    }

    public void setSupports(List<Support> supports) {
        this.supports = supports;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public CommercialProduct getCommercialProduct() {
        return commercialProduct;
    }

    public void setCommercialProduct(CommercialProduct commercialProduct) {
        this.commercialProduct = commercialProduct;
    }

    public SalesMode getSalesMode() {
        return salesMode;
    }

    public void setSalesMode(SalesMode salesMode) {
        this.salesMode = salesMode;
    }
}
