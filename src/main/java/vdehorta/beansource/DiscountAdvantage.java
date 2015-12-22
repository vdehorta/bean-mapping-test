package vdehorta.beansource;

/**
 * Avantage de type modulation d'un engagement. Valeur injecté au schéma de calcul pour pouvoir calculé les niveaux tarifaire.
 */
public class DiscountAdvantage {

    // fields

    /**
     * Identifiant technique
     */
    protected Integer id = 654665;

    /**
     * Montant de l'avantage lorsque l'on a le choix entre montant et taux
     */
    protected Amount amount = new Amount();

    /**
     * Engagement
     */
    protected Commitment commitment = new Commitment();

    /**
     * Indique si le taux est figé
     */
    protected boolean fixedRate = true;

    /**
     * TRANSIENT - indicateur qui permet de rendre applicable ou pas l'avantage (surcharge manuelle)
     */
    private boolean applied = true;

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

    public Commitment getCommitment() {
        return commitment;
    }

    public void setCommitment(Commitment commitment) {
        this.commitment = commitment;
    }

    public boolean isFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(boolean fixedRate) {
        this.fixedRate = fixedRate;
    }

    public boolean isApplied() {
        return applied;
    }

    public void setApplied(boolean applied) {
        this.applied = applied;
    }
}
