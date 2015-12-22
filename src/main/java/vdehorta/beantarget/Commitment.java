package vdehorta.beantarget;

import org.joda.time.LocalDate;

import java.util.Set;

/**
 * Engagement d'investissement sur une chaine/support pour un mode de vente / {@link SalesMode}.
 */
public class Commitment {

    // fields
    /**
     * Identifiant technique
     */
    private Integer id;

    /**
     * Montant d'investissemnt
     */
    private Amount amount;

    /**
     * Mode de vente
     */
    private SalesMode salesMode;

    /**
     * Support
     */
    private Support support;

    /**
     * Nom
     */
    private String name;

    /**
     * Avantages de types modulation
     */
    private Set<DiscountAdvantage> discountAdvantages;

    /**
     * Partie d'accord
     */
    private AgreementPartVersion agreementPartVersion;

    /**
     * Date de début
     */
    private LocalDate beginDate;

    /**
     * Date de fin
     */
    private LocalDate endDate;

    /**
     * Plages ecrans
     */
    private Set<CommitmentBreaks> breaks;

    /**
     * Autres avantages associés à l'engagement
     */
    private Set<OtherAdvantageValue> otherAdvantageValues;

    /**
     * Activation / désactivation d'un engagement
     */
    private boolean active;

    /**
     * Commentaires
     */
    private String comments;

    /**
     * clients (d'un même groupe)
     */
    private Set<Customer> advertisers;

    /**
     * produits
     */
    private Set<Product> products;

    /**
     * campagnes d'un produit
     */
    private Set<CampaignHeader> campaigns;

    /**
     * Flag de inclusion/exlusion des annonceurs, produits et campagnes
     */
    private boolean perimeterIncluded;

    private Integer groupeIndiceId;

    /**
     * Engagé au niveau de l'interface graphique
     */
    private Boolean ttv;

    /**
     * Information des engagements Sigma
     */
    private CommitmentSigma commitmentSigma;

    /**
     * Produit commercial
     */
    private CommercialProduct commercialProduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public SalesMode getSalesMode() {
        return salesMode;
    }

    public void setSalesMode(SalesMode salesMode) {
        this.salesMode = salesMode;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DiscountAdvantage> getDiscountAdvantages() {
        return discountAdvantages;
    }

    public void setDiscountAdvantages(Set<DiscountAdvantage> discountAdvantages) {
        this.discountAdvantages = discountAdvantages;
    }

    public AgreementPartVersion getAgreementPartVersion() {
        return agreementPartVersion;
    }

    public void setAgreementPartVersion(AgreementPartVersion agreementPartVersion) {
        this.agreementPartVersion = agreementPartVersion;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Set<CommitmentBreaks> getBreaks() {
        return breaks;
    }

    public void setBreaks(Set<CommitmentBreaks> breaks) {
        this.breaks = breaks;
    }

    public Set<OtherAdvantageValue> getOtherAdvantageValues() {
        return otherAdvantageValues;
    }

    public void setOtherAdvantageValues(Set<OtherAdvantageValue> otherAdvantageValues) {
        this.otherAdvantageValues = otherAdvantageValues;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<Customer> getAdvertisers() {
        return advertisers;
    }

    public void setAdvertisers(Set<Customer> advertisers) {
        this.advertisers = advertisers;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<CampaignHeader> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(Set<CampaignHeader> campaigns) {
        this.campaigns = campaigns;
    }

    public boolean isPerimeterIncluded() {
        return perimeterIncluded;
    }

    public void setPerimeterIncluded(boolean perimeterIncluded) {
        this.perimeterIncluded = perimeterIncluded;
    }

    public Integer getGroupeIndiceId() {
        return groupeIndiceId;
    }

    public void setGroupeIndiceId(Integer groupeIndiceId) {
        this.groupeIndiceId = groupeIndiceId;
    }

    public Boolean getTtv() {
        return ttv;
    }

    public void setTtv(Boolean ttv) {
        this.ttv = ttv;
    }

    public CommitmentSigma getCommitmentSigma() {
        return commitmentSigma;
    }

    public void setCommitmentSigma(CommitmentSigma commitmentSigma) {
        this.commitmentSigma = commitmentSigma;
    }

    public CommercialProduct getCommercialProduct() {
        return commercialProduct;
    }

    public void setCommercialProduct(CommercialProduct commercialProduct) {
        this.commercialProduct = commercialProduct;
    }
}
