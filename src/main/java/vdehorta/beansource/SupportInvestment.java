package vdehorta.beansource;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Investissement sur un groupe de supports défini au cours du brief
 */
public class SupportInvestment {

    /**
     * Identifiant technique
     */
    private Integer id = 541;

    /**
     * Support sur lequel porte cet investissement
     */
    private List<Support> supports = Lists.newArrayList(new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support());

    /**
     * Valeur de l'investissement
     */
    private Amount amount = new Amount();

    /**
     * produit commercial
     */
    private CommercialProduct commercialProduct = new CommercialProduct();

    /**
     * mode d'achat
     */
    private SalesMode salesMode = new SalesMode();

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
