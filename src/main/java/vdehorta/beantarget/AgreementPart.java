package vdehorta.beantarget;

import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Simulation d'un calcul des montants investissements. La simulation se décline en plusieurs version. la dernière est nommé courante.
 */
public class AgreementPart {

    /**
     * Identifiant technique
     */
    private Integer id;

    /**
     * Nom de la simulation
     */
    private String name;

    /**
     * L'accord sur lequel porte la simulation
     */
    private Agreement agreement;

    /**
     * Date de début de la période d'application
     */
    private LocalDate beginDate;

    /**
     * Date de fin de la période d'application
     */
    private LocalDate endDate;

    // Brief

    /**
     * Engagé au niveau de l'interface graphique
     */
    private Boolean ttv;

    /**
     * Montant Barter
     */
    private BigDecimal montantBarter;

    /**
     * Unité de valeur de l'engagement ( Net CO, Net FO, Brut Tarif)
     */
    private PricingLevelType globalInvestmentLevel;

    /**
     * commentaires client
     */
    private String comments;

    /**
     * famille observée
     */
    private Family family;


    /**
     * Investissement par Groupe de supports
     */
    private Set<SupportInvestment> supportInvestments;

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

    /**
     * Commercial en charge de l'accord
     */
    private User commercial;

    /**
     * Commentaire externe global à la simulation
     **/
    private String simulationExternalComments;

    /**
     * Commentaire interne global à la simulation
     **/
    private String simulationInternalComments;

    /**
     * Commentaire de l'utilisateur en fonction du ttv
     */
    private String ttvComments;

    /**
     * Groupe de support associé à la simulation
     */
    private SupportGroup supportGroup;

    // Information sur la version courante
    /**
     * l'identifiant technique de la version (pas mis dans la map car pas affiché
     */
    private Integer currentVersion;

    // constructors
    public AgreementPart() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
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

    public Boolean getTtv() {
        return ttv;
    }

    public void setTtv(Boolean ttv) {
        this.ttv = ttv;
    }

    public BigDecimal getMontantBarter() {
        return montantBarter;
    }

    public void setMontantBarter(BigDecimal montantBarter) {
        this.montantBarter = montantBarter;
    }

    public PricingLevelType getGlobalInvestmentLevel() {
        return globalInvestmentLevel;
    }

    public void setGlobalInvestmentLevel(PricingLevelType globalInvestmentLevel) {
        this.globalInvestmentLevel = globalInvestmentLevel;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Set<SupportInvestment> getSupportInvestments() {
        return supportInvestments;
    }

    public void setSupportInvestments(Set<SupportInvestment> supportInvestments) {
        this.supportInvestments = supportInvestments;
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

    public User getCommercial() {
        return commercial;
    }

    public void setCommercial(User commercial) {
        this.commercial = commercial;
    }

    public String getSimulationExternalComments() {
        return simulationExternalComments;
    }

    public void setSimulationExternalComments(String simulationExternalComments) {
        this.simulationExternalComments = simulationExternalComments;
    }

    public String getSimulationInternalComments() {
        return simulationInternalComments;
    }

    public void setSimulationInternalComments(String simulationInternalComments) {
        this.simulationInternalComments = simulationInternalComments;
    }

    public String getTtvComments() {
        return ttvComments;
    }

    public void setTtvComments(String ttvComments) {
        this.ttvComments = ttvComments;
    }

    public SupportGroup getSupportGroup() {
        return supportGroup;
    }

    public void setSupportGroup(SupportGroup supportGroup) {
        this.supportGroup = supportGroup;
    }

    public Integer getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
    }
}
