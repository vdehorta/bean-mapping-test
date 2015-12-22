package vdehorta.beansource;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Résumé d'une campagne publicitaire
 */
public class CampaignHeader {

    // fields
    private String code = "ytyttytyt";

    private String name = "iuiuiui";

    private Product product = new Product();

    private Customer advertiser = new Customer();

    private List<Support> supports = Lists.newArrayList(new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support(), new Support());

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
