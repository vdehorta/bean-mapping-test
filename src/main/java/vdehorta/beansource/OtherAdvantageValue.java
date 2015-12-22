package vdehorta.beansource;

/**
 * Avantage n'impactant pas les calculs accordé
 */
public class OtherAdvantageValue {

    /** Identifiant Technique */
    protected Integer id = 421;

    /** Avantage */
    protected OtherAdvantage advantage = new OtherAdvantage();

    /** Engagement */
    protected Commitment commitment = new Commitment();

    /** Commentaire */
    protected String comment = "dffgdfggfgf";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OtherAdvantage getAdvantage() {
        return advantage;
    }

    public void setAdvantage(OtherAdvantage advantage) {
        this.advantage = advantage;
    }

    public Commitment getCommitment() {
        return commitment;
    }

    public void setCommitment(Commitment commitment) {
        this.commitment = commitment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
