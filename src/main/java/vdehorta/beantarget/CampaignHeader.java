package vdehorta.beantarget;

import java.util.List;

/**
 * Résumé d'une campagne publicitaire
 */
public class CampaignHeader {

    // fields
    private String code;

    private String name;

    private Product product;

    private Customer advertiser;

    private List<Support> supports;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Customer advertiser) {
        this.advertiser = advertiser;
    }

    public List<Support> getSupports() {
        return supports;
    }

    public void setSupports(List<Support> supports) {
        this.supports = supports;
    }
}
